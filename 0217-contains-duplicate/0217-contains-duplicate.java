class Solution {
    public boolean containsDuplicate(int[] nums) {

        int n = nums.length;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {

            // check
            if (set.contains(nums[i])) {
                return true;
            }

            // insert
            set.add(nums[i]);
        }

        return false;
    }
}
