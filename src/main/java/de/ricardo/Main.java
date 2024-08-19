package de.ricardo;

public class Main {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum+=array1[i];
        }

        System.out.println("Sum of Array 1: " + sum);

        int max = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        System.out.println("Max of Array 1: " + max);

        int[] array2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        int [] resultArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            resultArray[i] = array1[i] + array2[i];
        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(resultArray[i]);
        }
    }
}