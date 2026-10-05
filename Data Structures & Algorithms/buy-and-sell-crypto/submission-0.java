class Solution {
    public int maxProfit(int[] prices) {
        int mprofit =0;
        int l=0;
        int r=1;

        while(r<prices.length){
            
            if(prices[r]>prices[l]){
                int profit=prices[r]-prices[l];
                mprofit=Math.max(profit, mprofit);
                

            }
            else{l=r;}
            r++;
            

        }
        return mprofit;

        
    }
}
