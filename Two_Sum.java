import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

    // O (n^2)
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 0;
        for (i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { i, j };
    }

    // O(n)
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[] { numToIndex.get(target - nums[i]), i };
            }
            numToIndex.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Two_Sum twoSum = new Two_Sum();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }

}
