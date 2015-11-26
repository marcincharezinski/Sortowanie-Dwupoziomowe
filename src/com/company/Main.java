package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        final int MAX_ROWS = 10;
        final int MIN_ROWS = 5;
        final int MAX_SIZE = 20;
        final int MIN_SIZE = 10;

        int rows = new Random().ints(MIN_ROWS, MAX_ROWS).findFirst().getAsInt();
        int[][] multiArray = new int[rows][];

        for (int j = 0; j < rows; j++) {
            int size = new Random().ints(MIN_SIZE, MAX_SIZE).findFirst().getAsInt();
            multiArray[j] = new int[size];

            multiArray[j] = new Random().ints(size).toArray();
        }

        System.out.println("Multi array before: ");
        System.out.println(Arrays.deepToString(multiArray).replace("], ", "]\n"));
        System.out.println();

        for (int[] row : multiArray) {
            Arrays.sort(row); // Metoda sort() pochodzi z java.util, ew można tutaj zaimplikować swoją
        }

        System.out.println("Multi array after first step: ");
        System.out.println(Arrays.deepToString(multiArray).replace("], ", "]\n"));
        System.out.println();

        Arrays.sort(multiArray, new Comparator<int[]>() {
            public int compare(int[] firstRow, int[] secondRow) {
                return firstRow.length - secondRow.length;
            }
        });

        System.out.println("Multi array after second step: ");
        System.out.println(Arrays.deepToString(multiArray).replace("], ", "]\n"));
        System.out.println();
    }


}


