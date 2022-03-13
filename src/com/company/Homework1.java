package com.company;

public class Homework1 {
    public static void main(String[] args) {
        int[] array = {-23, 55, 6, 66, -222, 0, 1, 48933, -1111020};

        System.out.println("The smallest number in array is: " + getSmallestNumberInArray(array));
        System.out.println("The largest number in array is: " + getLargestNumberInArray(array));

    }

    public static int getSmallestNumberInArray(int[] array) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < result) {
                result = array[i];
            }
        }
        return result;
    }

    public static int getLargestNumberInArray(int[] array) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }
        return result;
    }
}
