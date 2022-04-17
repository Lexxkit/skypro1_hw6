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
        System.out.println("\nTask 6. Reverse array with additional array.\n");
        int[] initialArr = {5, 4, 3, 2, 1};
        int[] reversedArr = new int[initialArr.length];
        System.out.println("Initial array before: " + Arrays.toString(initialArr));

        for (int i = 0; i < initialArr.length ; i++) {
            reversedArr[initialArr.length - 1 - i] = initialArr[i];
        }
        initialArr = reversedArr;
        System.out.println("Initial array after : " + Arrays.toString(initialArr));

        //Task 7
        System.out.println("\nTask 7. Reverse array without additional array.\n");
        int[] arr = {5, 4, 3, 2, 1};

        int tempNum;

        for (int i = 0; i < arr.length / 2; i++) {
            tempNum = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tempNum;
        }

        if (Arrays.equals(arr, reversedArr)) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are NOT equal.");
        }
        System.out.println("Test array: " + Arrays.toString(reversedArr));
        System.out.println("My array: " + Arrays.toString(arr));

        // Task 8
        System.out.println("\nTask 8. Find two digits which sum equals -2.\n");
        arr = new int[]{-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        System.out.println("Initial array: " + Arrays.toString(arr));


        findTwoNumbersWithPredefinedSum(arr, -2, true);

        // Task 9
        System.out.println("\nTask 8. Find all two digits which sum equals -2 and count.\n");

        findTwoNumbersWithPredefinedSum(arr, -2, false);

    }

    public static void findTwoNumbersWithPredefinedSum(int[] arr, int sum, boolean isOnlyFirstPair) {
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        int counter = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            if (isOnlyFirstPair && counter >= 1) {
                break;
            }
            for (int j = 0; j < arr.length; j++) {
                int firstNum = arr[i];
                int secondNum = arr[j];
                if (firstNum + secondNum == sum) {
                    counter++;
                    System.out.printf("Pair # %d: %d and %d\n", counter, firstNum, secondNum);
                }
            }
        }

        if (!isOnlyFirstPair) {
            System.out.println("Found " + counter + " pairs with sum equals " + sum);
        }
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
