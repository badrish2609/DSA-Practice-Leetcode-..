class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int posIdx = 0; int negIdx = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
            arr[negIdx] = nums[i];
            negIdx = negIdx + 2;

            } else {
                arr[posIdx] = nums[i];
                posIdx = posIdx + 2;
            }
        } return arr;
    }
}