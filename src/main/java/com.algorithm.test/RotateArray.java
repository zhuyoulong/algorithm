package com.algorithm.test;

import java.util.Arrays;

public class RotateArray {

    /**
     * 循环替换
     * 思路最后一位替换当前指针指向的数字，并将当前指针j执行的的数字保存为临时变量作为下一次替换的数字
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        int temp, previous;
        int len = nums.length;
        for (int i = 0; i < k; i++) {
            previous = nums[len - 1];
            for (int j = 0; j < len; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
}
