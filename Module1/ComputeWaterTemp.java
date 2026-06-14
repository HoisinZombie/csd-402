/*
Andrew Estrada
Module 1.3
CSD-402
6/14/26
 */


import java.util.Scanner; // Scanner is in the java.util package

public class ComputeWaterTemp {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter waterMass
        System.out.print("Enter water mass in kilograms: ");
        double waterMass = input.nextDouble();

        //Prompt the user to enter initalTemp
        System.out.print("Enter initial water temperature in Celsius: ");
        double initialTemp = input.nextDouble();

        //Prompt the user to enter finalTemp
        System.out.print("Enter desired water temperature in Celsius: ");
        double finalTemp = input.nextDouble();

        //Compute Q, which is the result in Joules
        double Q = waterMass * (finalTemp - initialTemp) * 4184;

        //Display result
        System.out.println("The required Joules to reach your desired temperature of " + finalTemp +"  is " + Q);
    }
}