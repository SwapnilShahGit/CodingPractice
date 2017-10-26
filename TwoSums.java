import java.util.*;

class Solution {

    public static void main(String args[]){
        int[] testinput = {1,2,3,4,5};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(testinput, target)));
    }

    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        Map<Integer, Integer> refmap = new HashMap<Integer, Integer>();
        for (int x = 0; x < nums.length; x++){
            if (refmap.containsKey(target-nums[x])){
                result[0] = refmap.get(target-nums[x]);
                result[1] = x;
            } else {
                refmap.put(nums[x], x);
            }
        }

        return result;
	}
}
