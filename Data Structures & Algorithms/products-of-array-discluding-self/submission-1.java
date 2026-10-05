class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output= new int[nums.length];
        int pro=1;
        int count=0;

        for(int i=0;i<nums.length;i++){
            output[i]=1;
            if(nums[i]!=0){
            pro*=nums[i];}
            if(nums[i]==0){
                count++;

            }
            
        }
        if(count>1){
         for(int i=0;i<nums.length;i++) {
            output[i]=0;
         } 
         return output;
        }
        if(count==1){
            for (int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    output[i]=pro;
                }
                else{
                    output[i]=0;
                }
            }
            return output;
        }

          for(int i=0;i<nums.length;i++){
            if(nums[i]==0){continue;}
            output[i]=pro/nums[i];
            
            
        }
      
        
       return output; 
    }
}