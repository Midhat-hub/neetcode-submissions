class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i= 0; i<nums.length; i++){
            for(int j=i+1;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                if(nums[i]+nums[j]==target){
                    int small=Math.min(i,j);
                    int large=Math.max(i,j);
                    int[] a={small,large};
                    return a;
                }
            }
        }
        
        return new int[]{};
    }
}
