/*
Andrew Estrada
Module 4.2
CSD-402
7/5/2026
*/

import java.util.Arrays;

public class exampleArrays {

    //Method for finding the average of an array of short variables
    public static short averageShort(short[] array) {
        short sum = 0;

        for (short num1 : sList) {
            sum1 += num1;
        }
    }
    //Method for finding the average of an array of int variables
    public static int averageInt(int[] array) {

    }

    //Method for finding the average of an array of long variables
    public static long averageLong(long[] array) {

    }

    //Method for finding an array of double variables
    public static double averageDouble(double[] array) {

    }

    int[] iList = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

    long[] lList = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

    double[] dList = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
    public static void main(String[] args) {
        short[] sList = {5, 20, 32, 78, 120, 170, 177, 197, 230, 300};
        System.out.println(Arrays.toString(sList));
        short avg1 = averageShort(sList);
        System.out.println(avg1);

    }


}