
import java.util.Scanner;

public class CreditCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        int accountNumber = getIntInput(input, "Enter account number: ");
        double balance = getDoubleInput(input, "Enter beginning balance: ");
        double charges = getDoubleInput(input, "Enter total charges: ");
        double credits = getDoubleInput(input, "Enter total credits: ");
        double limit = getDoubleInput(input, "Enter credit limit: ");

        double newBalance = calculateBalance(balance, charges, credits);
        displayResult(accountNumber, limit, newBalance);

        input.close();
    }


    static double calculateBalance(double balance, double charges, double credits) {
        return balance + charges - credits;
    }


    static void displayResult(int account, double limit, double balance) {
        System.out.println("\nAccount Number: " + account);
        System.out.printf("Credit Limit: %.2f%n", limit);
        System.out.printf("New Balance: %.2f%n", balance);

        if (balance > limit) {
            System.out.println("Credit limit exceeded.");
        } else {
            System.out.println("Within credit limit.");
        }
    }


    static int getIntInput(Scanner sc, String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }

    static double getDoubleInput(Scanner sc, String msg) {
        System.out.print(msg);
        return sc.nextDouble();
    }
}
