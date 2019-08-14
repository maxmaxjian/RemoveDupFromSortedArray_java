public class Solution1 implements Solution {
    @Override
    public int removeDuplicates(int[] nums) {

        int len = 1;
        for (int i = len; i < nums.length; i++) {
            if (nums[len-1] != nums[i]) {
                nums[len++] = nums[i];
            }
        }

        return len;
    }
}
