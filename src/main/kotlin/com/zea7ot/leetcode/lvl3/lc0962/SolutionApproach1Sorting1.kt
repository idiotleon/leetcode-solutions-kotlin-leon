/**
 * https://leetcode.com/problems/maximum-width-ramp/
 *
 * Time Complexity:     O(`totalNums` * lg(`totalNums`))
 * Space Complexity:    O(`totalNums`)
 *
 * References:
 *  https://leetcode.com/problems/maximum-width-ramp/discuss/208348/JavaC%2B%2BPython-O(N)-Using-Stack
 */
package com.zea7ot.leetcode.lvl3.lc0962

import com.zea7ot.leetcode.util.Constant.Annotation.Companion.UNUSED

@Suppress(UNUSED)
class SolutionApproach1Sorting1 {
    fun maxWidthRamp(nums: IntArray): Int {
        val totalNums = nums.size

        // pairs of value(s)-index(es)
        val pairs = Array(totalNums) { idx -> intArrayOf(nums[idx], idx) }
        // to sort by values
        pairs.sortBy { it[0] }

        var shortest = totalNums
        var widest = 0

        for (pair in pairs) {
            widest = maxOf(widest, pair[1] - shortest)
            shortest = minOf(shortest, pair[1])
        }

        return widest
    }
}