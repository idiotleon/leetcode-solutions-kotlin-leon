/**
 * https://leetcode.com/problems/container-with-most-water/
 *
 * Time Complexity:     O(N)
 * Space Complexity:    O(1)
 *
 * References:
 *  https://leetcode.com/problems/container-with-most-water/discuss/6091/Easy-Concise-Java-O(N)-Solution-with-Proof-and-Explanation
 */
package com.zea7ot.leetcode.lvl3.lc0011

import com.zea7ot.leetcode.util.Constant.Annotation.Companion.UNUSED

@Suppress(UNUSED)
class SolutionApproach0TwoPointers {
    fun maxArea(heights: IntArray): Int {
        // sanity check
        if (heights.isEmpty()) return 0

        val size = heights.size
        var lo = 0
        var hi = size - 1
        var maxArea = 0

        while (lo < hi) {
            val area = minOf(heights[lo], heights[hi]) * (hi - lo)
            maxArea = maxOf(maxArea, area)

            if (heights[lo] < heights[hi])
                ++lo
            else --hi
        }

        return maxArea
    }
}