package com.example.java.medium;

public class MaxSubArraySum53 {

/* 
 Given an integer array nums, find the subarray with the largest sum, and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
*/   

public int maxSubArray(int[] nums) {

    int currSum =0, maxSum =Integer.MIN_VALUE;
    
    for(int val:nums){
        currSum +=val;
        maxSum = Math.max(currSum, maxSum);
        if(currSum < 0 ) {
            currSum=0;
        }
            
    }

    return maxSum;
   }
   public static void main(String[] args) {
    MaxSubArraySum53 sum53 = new MaxSubArraySum53();
    int[] nums = {5,4,-1,7,8};
     int result =sum53.maxSubArray(nums);
     System.out.println("REsut : "+result);
   }

}
