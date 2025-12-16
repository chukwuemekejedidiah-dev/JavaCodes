import java.util.Scanner;

public class TaxCalculator {

    public static double calculateTax(double income) {
        if (income <= 30000) return income * 0.15;
        public static void runTaxCalculator()
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++)
            System.out.print("Enter citizen name: ");
        String name = input.next();

        System.out.print("Enter annual income: ");
         income = input.nextDouble();

        double tax = calculateTax(income);
        System.out.println("Tax for%.2f%n", name, tax);
    }
}

