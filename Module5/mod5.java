/*
Andrew Estrada
Module 5.2
CSD-402
7/12/26
*/

import java.util.Arrays;

public class mod5 {
    
    //method returning the location of the largest element in an array as a double (returns a one-dimensional array containing two location elements).
    //Unfortunately, I had to relegate this method to a comment because I wasn't able to get the overloaded methods to work.
    //public static int[] locateLargest (double[][] arrayParam) {}

    //method returning the location of the largest element in an array as an integer (returns a one-dimensional array containing two location elements).
    public static int[] locateLargest(int[][] arrayParam) {
    if (arrayParam == null || arrayParam.length == 0 || arrayParam[0].length == 0) {
        return new int[]{-1, -1};
    }
    
    int[] location = {0, 0};
    int largest = arrayParam[0][0];
    
    for (int i = 0; i < arrayParam.length; i++) {
        for (int j = 0; j < arrayParam[i].length; j++) {
            if (arrayParam[i][j] > largest) {
                largest = arrayParam[i][j];
                location[0] = i;
                location[1] = j;
            }
        }
    }
    
    return location;
    }

    //method returning the location of the smallest element in an array as a double (returns a one-dimensional array containing two location elements).
    //Unfortunately, I had to relegate this method to a comment because I wasn't able to get the overloaded methods to work.
    //public static int[] locateSmallest (double[][] arrayParam) {}

    //method returning the location of the smallest element in an array as an integer (returns a one-dimensional array containing two location elements).
    public static int[] locateSmallest(int[][] arrayParam) {
    if (arrayParam == null || arrayParam.length == 0 || arrayParam[0].length == 0) {
        return new int[]{-1, -1};
    }
    
    int[] location = {0, 0};
    int smallest = Integer.MAX_VALUE;
    
    for (int i = 0; i < arrayParam.length; i++) {
        for (int j = 0; j < arrayParam[i].length; j++) {
            if (arrayParam[i][j] < smallest) {
                smallest = arrayParam[i][j];
                location[0] = i;
                location[1] = j;
            }
        }
    }
    
    return location;
    }


    public static void main(String[] args) {

        //Creating a multidimensional array to use for this program (Bryan Fury is the name of a character from the video game, Tekken.)
        int[][] bryanFury = { 
        {94, 71, 19, 20}, 
        {42, 36, 28, 65}, 
        {9, 72, 47, 96}, 
        {51, 36, 57, 99} 
        };

        int[] largeInt = locateLargest(bryanFury);
        System.out.println("The largest integer is located at " + Arrays.toString(largeInt));

        int[] smallInt = locateSmallest(bryanFury);
        System.out.println("The smallest integer is located at " +Arrays.toString(smallInt));
    }
}