package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public double findMedianSortedArrays(int[] nums1, int[] nums2 , int m, int n) {
        int[] sortedArray = new int[m + n];
        int lengthOfSortedArray = m + n;
        int i = 0;
        int j = 0;
        int indexOfSortedArray = 0;


        while (i + j < lengthOfSortedArray - 1) {
            if (nums1[i] > nums2[j]) {
                sortedArray[i + j] = nums2[j];
                if ()
            } else {

            }
        }

        for (int x = 0; x < lengthOfSortedArray; x++) {
            System.out.println(sortedArray[x]);
        }

        return 0.0;
    }

    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int nums1[] = new int[m];
        for(int i = 0 ; i < m ; i++) {
            nums1[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int nums2[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            nums2[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        for(int i = 0 ; i < q ; i++) {
            int size1 = scanner.nextInt();
            int size2 = scanner.nextInt();
            double result = new Main().findMedianSortedArrays(nums1,nums2,size1,size2);
            System.out.println(result);
        }
        scanner.close();
    }
}
