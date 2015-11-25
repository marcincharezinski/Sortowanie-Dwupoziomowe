package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        final int MAX_ARRAYS = 10;
        final int MIN_ARRAYS = 5;
        final int MAX_SIZE = 20;
        final int MIN_SIZE = 10;

        int numberOfArrays = new Random().ints(MIN_ARRAYS, MAX_ARRAYS).findFirst().getAsInt();
        System.out.println("numbersOfArrays: " + numberOfArrays);

        for (int j = 0; j < numberOfArrays; j++) {

            int size = new Random().ints(MIN_SIZE, MAX_SIZE).findFirst().getAsInt();
            int[] array = new Random().ints(size).toArray();

            System.out.println(Arrays.toString(array));

        }

        int[][] Array = new int[numberOfArrays][];
        System.out.println(Arrays.toString(Array));
    }

}


