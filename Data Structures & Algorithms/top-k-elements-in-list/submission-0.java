

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Store entries in a list
        List<Map.Entry<Integer, Integer>> list =
            new ArrayList<>(map.entrySet());

        // Sort by frequency
        list.sort((a, b) -> b.getValue() - a.getValue());

        // Take first k elements
        int[] r = new int[k];

        for (int i = 0; i < k; i++) {
            r[i] = list.get(i).getKey();
        }

        return r;
    }
}