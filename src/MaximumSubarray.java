//53. Maximum Subarray
//Given an integer array nums, find the contiguous subarray (containing at least one number)
//which has the largest sum and return its sum.
//
//A subarray is a contiguous part of an array.
public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            currentMax = Math.max(currentMax, currentSum);
        }
        return currentMax;
    }
}
