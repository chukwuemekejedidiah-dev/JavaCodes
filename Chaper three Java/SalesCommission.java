
import java.util.Scanner;

public class SalesCommission {

    public static double getItemPrice(int itemNumber) {
        switch (itemNumber) {
            case 1: return 239.99;
            case 2: return 129.75;
            case 3: return 99.95;
            case 4: return 350.89;
            default: return 0.0;
        }
    }

    public static void calculateEarnings() {
        Scanner input = new Scanner(System.in);
        double totalSales = 0;

        System.out.println("Enter item numbers sold (1-4). Enter -1 to stop:");
        int item;
        while ((item = input.nextInt()) != -1) {
            totalSales += getItemPrice(item);
        }

        double earnings = 200 + 0.09 * totalSales;
        System.out.printf("Total earnings: $%.2f%n", earnings);
    }
}



