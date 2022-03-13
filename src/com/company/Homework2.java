package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter array length: ");
        int arrayLength = scanner.nextInt();
        System.out.println(Arrays.toString(createArray(arrayLength)));

        scanner.close();
    }

    public static int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        }
        return array;
    }

}
