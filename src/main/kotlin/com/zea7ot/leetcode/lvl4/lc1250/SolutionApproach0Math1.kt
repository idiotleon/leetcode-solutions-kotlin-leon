/**
 * https://leetcode.com/problems/check-if-it-is-a-good-array/
 *
 * Time Complexity:     O(`totalNums`)
 * Space Complexity:    O(`totalNums`)
 *
 * References:
 *  https://leetcode.com/problems/check-if-it-is-a-good-array/discuss/419368/JavaC++Python-Chinese-Remainder-Theorem/378281
 *  https://leetcode.com/problems/check-if-it-is-a-good-array/discuss/419368/JavaC%2B%2BPython-Chinese-Remainder-Theorem
 */
package com.zea7ot.leetcode.lvl4.lc1250

import com.zea7ot.leetcode.util.Constant.Annotation.Companion.UNUSED

@Suppress(UNUSED)
class SolutionApproach0Math1 {
    fun isGoodArray(nums: IntArray): Boolean {
        // not used
        // val totalNums = nums.size

        var gcdRes = nums[0]
        for (num in nums) gcdRes = gcd(gcdRes, num)

        return gcdRes == 1
    }

    private fun gcd(x: Int, y: Int): Int {
        if (y == 0) return x
        return gcd(y, x % y)
    }
}