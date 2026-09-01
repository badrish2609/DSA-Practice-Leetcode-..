class Solution {
    public int majorityElement(int[] nums) {
    int n = nums.length;
    

    for (int i = 0; i < n; i++) {
        int freq = 0;
        for (int j = 0; j < n; j++) {
            if (nums[i] == nums [j]) {
                freq = freq + 1;
            }
        }if (freq > n/2) {
        return nums[i];
    }
    }  return -1;
    }
}