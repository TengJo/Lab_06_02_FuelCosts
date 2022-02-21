import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double gasInTank = 0;
        double fuelEfficiency = 0;
        double gasPrice = 0;
        double miles100;
        double distancePossible;
        String trashGasInTank = null;
        String trashFuelEfficiency = null;
        String trashGasPrice = null;
        Scanner in = new Scanner(System.in);

        // Gallons in the Tank
        System.out.print("What is the amount of gallons in the tank: ");
        if (in.hasNextDouble())
        {
            gasInTank = in.nextDouble();
        }
        else
        {
            trashGasInTank = in.nextLine();
            System.out.println(" You have entered an incorrect value: " + trashGasInTank);
            System.out.println("Run the program again.");
            System.exit(0);
        }

        //Fuel Efficiency
        System.out.print("What is the fuel efficiency (miles per gallon): ");
        if (in.hasNextDouble())
        {
            fuelEfficiency = in.nextDouble();
        }
        else
        {
            trashFuelEfficiency = in.nextLine();
            System.out.println(" You have entered an incorrect value: " + trashFuelEfficiency);
            System.out.println("Run the program again.");
            System.exit(0);
        }

        //Price of Gas
        System.out.print("What is the Price of the gas: ");
        if (in.hasNextDouble())
        {
            gasPrice = in.nextDouble();
        }
        else
        {
            trashGasPrice = in.nextLine();
            System.out.println(" You have entered an incorrect value: " + trashGasPrice);
            System.out.println("Run the program again.");
            System.exit(0);
        }
        miles100 = (100 / fuelEfficiency) * gasPrice;
        distancePossible = gasInTank * fuelEfficiency;

        System.out.printf("The cost of 100 miles is: $%5.2f\n", miles100);
        System.out.printf("The car can go %5.2f miles\n", distancePossible);

    }

}