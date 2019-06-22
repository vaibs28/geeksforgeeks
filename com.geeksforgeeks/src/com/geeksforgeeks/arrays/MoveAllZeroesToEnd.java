package com.geeksforgeeks.arrays;

public class MoveAllZeroesToEnd {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] arr = {1,0,2,3,0,4,7,0,0,8};
        int count=0;
        
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=0) {
                arr[count]=arr[i];
                count++;
            }
        }
       for(int i=count;i<arr.length;i++)
           arr[i]=0;
       
       for(int i=0;i<arr.length;i++)
           System.out.println(arr[i]);
        
    }

}
