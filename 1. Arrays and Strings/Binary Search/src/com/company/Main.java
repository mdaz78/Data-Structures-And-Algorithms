package com.company;

public class Main {
    public static boolean binarySearch(int target, int[] nums) {
        int floorIndex = -1;
        int ceilingIndex = nums.length;

        while (floorIndex + 1 < ceilingIndex) {
            int distance = ceilingIndex - floorIndex;
            int halfDistance = distance / 2;
            int guessIndex = floorIndex + halfDistance;

            int guessValue = nums[guessIndex];

            if (guessValue == target) {
                return true;
            }

            if (guessValue > target) {
                ceilingIndex = guessIndex;
            } else {
                floorIndex = guessIndex;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        boolean result = binarySearch(-1, new int[]{1, 2, 3, 4, 5, 6});
        System.out.println(result);
    }
}
