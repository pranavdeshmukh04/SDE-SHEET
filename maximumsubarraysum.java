public class maximumsubarraysum {
    public static long maxSubarraySum(int[] arr, int n) {
		long maxsum = arr[0], cursum = 0;
        for(int i=0; i<arr.length; i++){
            cursum += arr[i];
            maxsum = Math.max(maxsum,cursum);
            if(cursum < 0)
               cursum = 0;
        }
        if(maxsum < 0)
            return 0;
        else
            return maxsum;
	}
}
