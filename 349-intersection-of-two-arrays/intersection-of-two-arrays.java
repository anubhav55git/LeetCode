import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

      
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }

      
        int[] output = new int[result.size()];
        int index = 0;
        for (Integer num : result) {
            output[index++] = num;
        }

        return output;
    }
}
