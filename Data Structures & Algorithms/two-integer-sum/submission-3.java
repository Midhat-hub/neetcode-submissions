

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int toFind = target - nums[i];

            if (map.containsKey(toFind)) {
                int f = map.get(toFind);
                int[] r = {Math.min(f, i), Math.max(f, i)};
                return r;
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[]{};
    }
}