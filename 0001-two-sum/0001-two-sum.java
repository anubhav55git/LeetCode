import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {

              Map<Integer,Integer> hm=new HashMap<>();

              for(int i=0;i<nums.length;i++){
                int cal=target-nums[i];
                if(hm.containsKey(cal)){
                    return new int[]{hm.get(cal),i};
                }
                hm.put(nums[i],i);
              }

              return new int[]{};
    }
}
