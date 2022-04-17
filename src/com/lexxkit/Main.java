package com.lexxkit;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1. Sum of all monthly expenses.\n");

        int[] expenses = generateRandomArray();
        System.out.println(Arrays.toString(expenses));

        int monthlyExpenses = 0;

        for (int dailyExpense : expenses) {
            monthlyExpenses += dailyExpense;
        }

        System.out.println("Monthly expenses are " + monthlyExpenses + " rubles.");

        // Task 2
        System.out.println("\nTask 2. Min and max daily expense.\n");

        int minDailyExpense = 200_000;
        int maxDailyExpense = 100_000;

        for (int dailyExpense : expenses) {
            if (dailyExpense < minDailyExpense) {
                minDailyExpense = dailyExpense;
            }
            if (dailyExpense > maxDailyExpense) {
                maxDailyExpense = dailyExpense;
            }
        }

        System.out.printf("Minimum daily expense is %d rubles. Maximum daily expense is %d rubles.\n\n",
                minDailyExpense, maxDailyExpense);

        // Alternative approach with sort method
        System.out.println("Find Min and Max value with Arrays.sort method:");
        Arrays.sort(expenses);
        minDailyExpense = expenses[0];
        maxDailyExpense = expenses[expenses.length - 1];
        System.out.printf("Minimum daily expense is %d rubles. Maximum daily expense is %d rubles.\n",
                minDailyExpense, maxDailyExpense);

        // Task 3
        System.out.println("\nTask 3. Average daily expense.\n");

        double averageExpense = monthlyExpenses * 1.0 / expenses.length;

        System.out.printf("Average daily expense is %.2f rubles.\n", averageExpense);

        // Task 4
        System.out.println("\nTask 4. Reverse char array.\n");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

        //Task 5
        System.out.println("\nTask 5. Square matrix with filled diagonals.\n");
        int[][] matrix = new int[3][3];
        int matrixFiller = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j || (i + j == matrix.length - 1)) {
                    matrix[i][j] = matrixFiller;
                }
            }
        }

        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        //Task 6
        System.out.println("\nTask 6. Reverse array.\n");
        int[] initialArr = {5, 4, 3, 2, 1};
        int[] reversedArr = new int[initialArr.length];
        System.out.println("Initial array before: " + Arrays.toString(initialArr));

        for (int i = 0; i < initialArr.length ; i++) {
            reversedArr[initialArr.length - 1 - i] = initialArr[i];
        }
        initialArr = reversedArr;
        System.out.println("Initial array after : " + Arrays.toString(initialArr));

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
