package com.example.java.easy.old;
import java.util.*;

public class AddTwoInt {

    /**
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> pair = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(pair.containsKey(target-num)){
                return new int[]{i, pair.get(target-num)};
            }

            pair.put(num,i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int [] input = new int[]{3,3};
        int target=6;
        AddTwoInt addTwoInt = new AddTwoInt();
       int[] output = addTwoInt.twoSum(input, target);
       System.out.println(output[0]);
    }


}
