/*
LeetCode 561. Array Partition

Difficulty: Easy

Approach:
1. Sort the array.
2. Pair adjacent elements.
3. Add the first element of each pair.

Time Complexity: O(n log n)
Space Complexity: O(1)
*/

import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums);

        int ans = 0;

        for(int i = 0; i < nums.length; i += 2){
            ans += nums[i];
        }

        return ans;
    }
}
