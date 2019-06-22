package com.geeksforgeeks.arrays;

public class SortEvenAndOddNumbers {

    public static void main(String[] args) {
        // sort all even numbers in ascending order and all odd numbers in descending order
        // odd numbers should come first in the output
        int[] arr = {1,2,8,3,6,7,5,10,11};
        int oddCount=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]%2==1) {
                arr[oddCount] = arr[i];
                oddCount++;
            }
        }
        
        //for()
        
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
            
    }

}
