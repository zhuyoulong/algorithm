package com.algorithm.test;

/**
 * <p>Description:  remove-duplicates-from-sorted-array</p>
 * <p>Copyright: Copyright (c) 2019     </p>
 *
 * @author zhuyoulong
 * @date 2019-11-08
 * <p>Update Time:                      </p>
 * <p>Updater:                          </p>
 * <p>Update Comments:                  </p>
 */
public class RemoveDuplicatesFromSortedArray {

    /**
     * 删除排序数组中的重复项
     * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度
     * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成
     *
     * @param nums
     * @return
     * @author zhuyoulong
     * @date 2019/11/8
     */
    private static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int a = 0;
        int b = 1;
        int len = nums.length;
        while (b < len) {
            if (nums[a] != nums[b]) {
                nums[a + 1] = nums[b];
                a++;
            }
            b++;
        }
        return a + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

}
