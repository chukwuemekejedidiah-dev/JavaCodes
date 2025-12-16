
import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            double miles = getInput(input, "Enter miles driven (-1 to quit): ");
            if (miles == -1) {
                System.out.println("Exiting program.");
                break;
            }

            double gallons = getInput(input, "Enter gallons used: ");
            double mpg = calculateMPG(miles, gallons);
            displayResult(mpg);
        }

        input.close();
    }

    static double getInput(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextDouble();
    }

    static double calculateMPG(double miles, double gallons) {
        if (gallons == 0) return 0;
        return miles / gallons;
    }


    static void displayResult(double mpg) {
        System.out.printf("Miles per gallon: %.2f%n%n", mpg);
    }
}



