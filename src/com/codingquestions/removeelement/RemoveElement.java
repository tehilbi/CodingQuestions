package com.codingquestions.removeelement;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement(nums, 2));
    }

    private static int removeElement(int[] nums, int val) {
        int size = nums.length;
        int total = 0;

        for (int num : nums) {
            if (num == val) {
                total++;
            }
        }
        return size - total;
    }
}
