package _1_Two_Sum;


import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(numsMap.containsKey(complement)){
                return new int[]{numsMap.get(complement), i};
            }
            numsMap.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] array = {3, 3};
        int[] test = twoSum.twoSum(array, 6);
        System.out.println("result " + test[0] + " " + test[1]);
    }
}
