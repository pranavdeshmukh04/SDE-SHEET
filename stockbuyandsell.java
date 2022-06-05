public class stockbuyandsell {
    public int maxProfit(int[] prices) {
        if(prices.length < 2)
            return 0;
        
		int min = Integer.MAX_VALUE, maxprofit = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
			}else if(prices[i] - min > maxprofit){
                maxprofit = prices[i] - min;
            }
		}
		return maxprofit;
    }
}
