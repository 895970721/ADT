package simple;

import java.util.ArrayList;
import java.util.List;

public class TwoArrayMedian {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;

        int num1Len = nums1.length;
        int num2Len = nums2.length;

        List num3 = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] >= nums2[j]) {
                    num3.add(nums2[j]);
                } else {
                    num3.add(nums1[i]);
                    break;
                }
            }
        }

        return result;
    }
}
