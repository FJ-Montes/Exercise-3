import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("**********************************************");
        System.out.println("Mass, Density, and Volume Calculator");
        System.out.println("Choose an option:");
        System.out.println("1. Compute Mass");
        System.out.println("2. Compute Density");
        System.out.println("3. Compute Volume");
        System.out.println("0 - Exit Application");
        System.out.println("**********************************************");

        boolean validInput = false;
        while (!validInput) {
            try {
                switch (scan.nextInt()) {
                    case 1:
                        System.out.println(computeMass());
                        main(args);
                        validInput = true;
                        break;
                    case 2:
                        System.out.println(computeDensity());
                        main(args);
                        validInput = true;
                        break;
                    case 3:
                        System.out.println(computeVolume());
                        main(args);
                        validInput = true;
                        break;
                    case 0:
                        System.out.println("Program Terminated");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        validInput = false;
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid choice. Please enter a valid integer.");
                scan.nextLine();
                validInput = false;
                

            }
        }
    }

    public static String computeMass() {
        Scanner input = new Scanner(System.in);

        double density = 0;
        double volume = 0;

        try {
            System.out.println("Enter the density (in kg/m^3):");
            density = input.nextDouble();
            System.out.println("Enter the volume (in m^3):");
            volume = input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid decimal number.");
            computeMass();
        }

        double mass = density * volume;
        return "The mass is: " + mass + " kg";

    }

    public static String computeDensity() {
        Scanner input = new Scanner(System.in);

        double mass = 0;
        double volume = 0;

        try {
            System.out.println("Enter the mass (in kg):");
            mass = input.nextDouble();
            System.out.println("Enter the volume (in m^3):");
            volume = input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid decimal number.");
            computeDensity();
        }

        double density = mass / volume;
        return "The density is: " + density + " kg/m^3";

    }

    public static String computeVolume() {
        Scanner input = new Scanner(System.in);

        double mass = 0;
        double density = 0;

        try {
            System.out.println("Enter the mass (in kg):");
            mass = input.nextDouble();
            System.out.println("Enter the density (in kg/m^3):");
            density = input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid decimal number.");
            computeVolume();
        }

        double volume = mass / density;
        return "The volume is: " + volume + " m^3";

    }

}
