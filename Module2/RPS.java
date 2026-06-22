/*
Andrew Estrada
Module 2.2
CSD-402
6/21/26
 */

//importing the scanner class for user input
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        //Create a scanner object
        Scanner input = new Scanner(System.in);

        //Generate random number between 1 and 3
        int cpunumber = (int)(Math.random() * 3) + 1;

        //Prompt user for their selection
        System.out.println("This is a rock, paper, scissors style game against the computer.");
        System.out.println("1 = rock, 2 = paper, and 3 = scissors.");
        System.out.print("Enter 1, 2, or 3: ");
        int userselection = input.nextInt();

        //Show what the user input and what the CPU input
        System.out.println("You threw a " + userselection);
        System.out.println("The computer threw a " + cpunumber);

        //Calculate win or loss if userselection is 1
        if (userselection == 1) {
            if (cpunumber == 1)
                System.out.print("You tie");
        }

        if (userselection == 1) {
            if (cpunumber == 2)
                System.out.print("You lose");
        }

        if (userselection == 1) {
            if (cpunumber == 3)
                System.out.print("You win");
        }

        //Calculate win or loss if userselection is 2
        if (userselection == 2) {
            if (cpunumber == 1)
                System.out.print("You win");
        }

        if (userselection == 2) {
            if (cpunumber == 2)
                System.out.print("You tie");
        }

        if (userselection == 2) {
            if (cpunumber == 3)
                System.out.print("You lose");
        }

        //Calculate win or loss if userselection is 3
        if (userselection == 3) {
            if (cpunumber == 1)
                System.out.print("You lose");
        }

        if (userselection == 3) {
            if (cpunumber == 2)
                System.out.print("You win");
        }

        if (userselection == 3) {
            if (cpunumber == 3)
                System.out.print("You tie");
        }
    }
}