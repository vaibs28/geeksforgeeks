package com.geeksforgeeks.arrays;

public class UnionAndIntersection {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //union and intersection of 2 sorted arrays
        
        int[] arr1 = {1,1,2,2,2,3,4,5,7};
        int[] arr2 = {2,3,5,6,10};
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] unionArr = new int[len1+len2];
        
        //union - should have all the elements once
        int i=0,j=0,k=0;
        while(i<len1 && j<len2) {
            if(arr1[i]==arr2[j]) {
                unionArr[k++]= arr1[i];
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]) {
                unionArr[k++] = arr1[i++];
            }
            else {
                unionArr[k++] = arr2[j++];
            }
        }
        
        while(i<len1) {
            unionArr[k++] = arr1[i++];
        }
        
        while(j<len2) {
            unionArr[k++] = arr2[j++];
        }
        
        for(i=0;i<k;i++) {
            System.out.print(unionArr[i]+" ");
        }
    }

}
