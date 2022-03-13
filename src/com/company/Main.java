package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int a = 3;

        System.out.println(a + " is on index: " + getIndexOfArrayElement(array, a));
    }

    public static String getIndexOfArrayElement(int[] array, int number) {
        String result = "-1";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                result = "" + i;
            }
        }
        if (result.equals("-1")) {
            return "There is no such element in the array";
        }
        return result;
    }

}
