class Solution {
    public int minOperations(int[] nums) {
        int ans=0;
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            if(result>=nums[i]){
                ans+=result-nums[i]+1;
                result++;
            }
            else
                result=nums[i];
        }
        return ans;
    }
}