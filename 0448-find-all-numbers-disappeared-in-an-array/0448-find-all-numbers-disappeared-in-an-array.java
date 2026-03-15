import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        // Mark numbers as seen by negating the value at their corresponding index
        for (int i = 0; i < n; i++) {
            // Use the absolute value to handle already-negated elements
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        // Collect all indices where the number is positive (unmarked)
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                // The missing number is i + 1
                ans.add(i + 1);
            }
        }

        return ans;
    }
}
