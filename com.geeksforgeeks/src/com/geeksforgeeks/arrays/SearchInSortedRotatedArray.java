package com.geeksforgeeks.arrays;

public class SearchInSortedRotatedArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] nums = {4,5,6,7,0,1,2};
        int target=0;
        int pivot=0;
        int res=-1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<nums[i]){
                pivot = i;
                break;
            }
        }
        if(target>nums[0]){
            res = binarySearch(nums,target,0,pivot);
        }
        else{
            res = binarySearch(nums,target,pivot+1,nums.length-1);
        }
        System.out.println(res);
    }
    
    public static int binarySearch(int[] nums,int key,int low,int high){
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==key)
                return mid;
            else if(key<nums[mid])
                high = mid-1;
            else
                low=mid+1;
        }
        return -1;
    }

}
