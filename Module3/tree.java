/*
Andrew Estrada
Module 3.2
CSD-402
6/28/26
 */

public class tree {

    public static void main(String[] args) {
       
        int rows = 7;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < (rows - 1 - i); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print((int) Math.pow(2, j) + " ");
            }

            for (int j = i - 1; j >= 0; j--) {
                System.out.print((int) Math.pow(2, j) + " ");
            }

            int length = (rows - 1 - i) * 2; 
            for (int j = 0; j <= i; j++) {
                length += String.valueOf((int) Math.pow(2, j)).length() + 1;
            }
            for (int j = i - 1; j >= 0; j--) {
                length += String.valueOf((int) Math.pow(2, j)).length() + 1;
            }

             for (int space = 0; space < (32 - length); space++) {
                System.out.print(" ");
            }

            System.out.println("@");
        }
    }
}