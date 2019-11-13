package com.algorithm.test;

import java.util.Arrays;

/**
 * <p>Description:  有效的字母异位词，通过数组操作</p>
 *
 * @author zhuyoulong
 * @date 2019年-11月-13日
 * <p>Update Time:                      </p>
 * <p>Updater:                          </p>
 * <p>Update Comments:                  </p>
 */
public class Ectopic {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram")); //true
        System.out.println(isAnagram("rat","car"));//false
    }

}
