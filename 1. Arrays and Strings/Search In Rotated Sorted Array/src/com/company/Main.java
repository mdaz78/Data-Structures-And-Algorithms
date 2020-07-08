package com.company;

import java.io.*;
import java.util.*;

public class Main {
    public int search(int[] nums, int target) {
        // Edge cases
        if(nums == null || nums.length == 0) {
            return -1;
        }

        int floorIndex = 0;
        int ceilingIndex = nums.length - 1;

        while (floorIndex <= ceilingIndex) {
            int guessIndex = floorIndex + ((ceilingIndex - floorIndex) / 2);
            int guessNum = nums[guessIndex];

            if (guessNum == target) {
                return guessIndex;
            }

            if (nums[floorIndex] <= guessNum) {
                if (target >= nums[floorIndex] && target < guessNum) {
                    ceilingIndex = guessIndex - 1;
                } else {
                    floorIndex = guessIndex + 1;
                }
            } else {
                if (target > guessNum && target <= nums[ceilingIndex]) {
                    floorIndex = guessIndex + 1;
                } else {
                    ceilingIndex = guessIndex - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nums[] = new int[n];
        for(int i = 0 ; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        while(q > 0) {
            int target = scanner.nextInt();
            int result = new Main().search(nums , target);
            System.out.println(result);
            q--;
        }
    }
}
