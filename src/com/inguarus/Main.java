package com.inguarus;

import java.util.Arrays;
import java.util.Random;

public class Main {

    static int[] arr = new int[100];

    static {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        minValueArray();
        frequentNumber();
        sortDescendingly();
    }

    private static void minValueArray() {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Minimum value of the array is " + min);
    }

    private static void frequentNumber() {
        int number = 0;
        int reiteration = 0;
        for (int temp : arr) {
            int tmp = frequency(arr, temp);
            if (reiteration < tmp) {
                number = temp;
                reiteration = tmp;
            }
        }

        System.out.println("The number " + number + " is repeated " + reiteration + " times ");

    }

    static int frequency(int[] arr, int x) {
        int value = 0;
        for (int temp : arr) {
            if (x == temp) {
                value++;
            }
        }
        return value;
    }

    private static void sortDescendingly() {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int k = j + 1; k < arr.length; k++) {
                if (arr[j] < arr[k]) {
                    int temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}


