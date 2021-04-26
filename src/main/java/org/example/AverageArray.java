package org.example;

public class AverageArray {
    public static void main(String[] args) {
        int[] elements = new int[]{43, 5, 23, 17, 2, 14};
        double sum1 = 0;
        for (int i = 0; i < elements.length; i++)
            sum1 = sum1 + elements[i];
        double average = sum1 / elements.length;
        System.out.println("Average is: " + average);
    }
}



