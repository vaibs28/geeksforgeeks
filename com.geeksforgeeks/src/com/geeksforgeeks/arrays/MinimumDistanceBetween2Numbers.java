package com.geeksforgeeks.arrays;

public class MinimumDistanceBetween2Numbers {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] arr = { 3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 3, 8 };
        int x = 3;
        int y = 6;
        int min = Integer.MAX_VALUE;
        bruteForceMethod(arr, x, y, min);
        optimizedMethod(arr, x, y, min);

    }

    public static void bruteForceMethod(int[] arr, int x, int y, int min) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x || arr[i] == y) {
                for (int j = i + 1; j < arr.length; j++) {
                    if ((arr[j] == y && arr[i] == x) || (arr[j] == x && arr[i] == y)) {
                        int res = j - i;
                        if (res < min)
                            min = res;
                    }
                }
            }
        }
        System.out.println("Minimum distance=" + min);
    }

    public static void optimizedMethod(int[] arr, int x, int y, int min) {
        int prev = 0;
        int res = 0;
        // finding first occurence of x or y
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == x || arr[i] == y) {
                prev = i;
                break;
            }
        }

        // finding the next occurences and updating the min
        while (i < arr.length) {
            if (arr[i] == x || arr[i] == y) {
                if (arr[i] != arr[prev] && (i - prev) < min) {
                    min = i - prev;
                    prev = i;
                }
                else
                    prev = i;
            }
            i++;
        }
        System.out.println("minimum=" + min);
    }
}
