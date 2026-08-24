class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int Exceptedsum = n * (n+1)/2;
        int Actualsum = 0;
        for (int i = 0; i < n; i++) {
            Actualsum = Actualsum + nums[i];
        } return Exceptedsum - Actualsum;
    }
}