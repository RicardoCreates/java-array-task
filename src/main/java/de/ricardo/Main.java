package de.ricardo;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }

        System.out.println("Sum of Array 1: " + sum);

        int max = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        System.out.println("Max of Array 1: " + max);

        int[] array2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 22};


        // war das überhaupt gefragt?
//        for (int i = 0; i < array2.length; i++) {
//            System.out.println(array2[i]);
//        }

        // create new array to store sums
        int[] resultArray = new int[array1.length];

        // perform element-wise addition of the two arrays
        for (int i = 0; i < array1.length; i++) {
            resultArray[i] = array1[i] + array2[i];
        }

        // print out result array
        System.out.println("Result Array: ");
        for (int n : resultArray) {
            System.out.println(n);
        }

        // scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");

        String inputText = scanner.nextLine();

        System.out.println("Individual letters:");
        for(char c : inputText.toCharArray()) {
            System.out.println(c);
        }

        scanner.close();
    }
}