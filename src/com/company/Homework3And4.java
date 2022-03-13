package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3And4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[3];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please, enter a number:");
            array[i] = scanner.nextInt();
        }

        System.out.println("Your data is: " + Arrays.toString(array));

        System.out.println("The duplicated number is: " + findDuplicatedNumbersInArray(array));

        scanner.close();
    }

    public static String findDuplicatedNumbersInArray(int[] array) {
        String result = "";
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    result = "" + array[i];
                    break;
                }
            }
        }
        if (result.isEmpty()) {
            result = "There are no duplicated numbers.";
        }
        return result;
    }
}
