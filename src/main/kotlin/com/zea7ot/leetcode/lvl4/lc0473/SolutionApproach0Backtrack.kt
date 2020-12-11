/**
 * https://leetcode.com/problems/matchsticks-to-square/
 *
 * Time Complexity:     O(4 ^ `totalNums`)
 * Space Complexity:    O(`n`)
 *
 * References:
 *  https://leetcode.com/problems/partition-to-k-equal-sum-subsets/discuss/108741/Solution-with-Reference/569560
 *  https://leetcode.com/problems/partition-to-k-equal-sum-subsets/discuss/108741/Solution-with-Reference
*/
package com.zea7ot.leetcode.lvl4.lc0473

import com.zea7ot.leetcode.util.Constant.Annotation.Companion.UNUSED

@Suppress(UNUSED)
class SolutionApproach0Backtrack {
    fun makesquare(nums: IntArray): Boolean {
        // not used
        // val totalNums = nums.size

        val volume = nums.sum()
        if (volume < 4 || volume % 4 != 0) return false

        return canPartition(0, 0, 4, volume / 4, nums)
    }

    private fun canPartition(startIdx: Int, curSum: Int, k: Int, target: Int, nums: IntArray): Boolean {
        val totalNums = nums.size

        if (k == 0) return true
        // one partition has been found (`k - 1`), to find the next one
        if (curSum == target) return canPartition(0, 0, k - 1, target, nums)
        if (curSum > target) return false

        for (idx in startIdx until totalNums) {
            if (nums[idx] != -1) {
                val hold = nums[idx]
                // to mark visited
                nums[idx] = -1
                // to further backtrack to the next state
                if (canPartition(1 + idx, curSum + hold, k, target, nums)) return true
                // to backtrack to the previous state
                nums[idx] = hold
            }
        }

        return false
    }
}