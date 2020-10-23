package com.zea7ot.leetcode.lc1074

import com.zea7ot.leetcode.lvl5.lc1074.SolutionApproach0PrefixSums
import org.junit.Test
import kotlin.test.assertEquals

class TestSolutionApproach0SlidingWindow {
    private val solution = SolutionApproach0PrefixSums()

    @Test
    fun sampleInput1_ShouldReturnExpected() {
        val matrix = arrayOf(intArrayOf(0, 1, 0), intArrayOf(1, 1, 1), intArrayOf(0, 1, 0))
        val target = 0

        val expected = 4

        assertEquals(expected, solution.numSubmatrixSumTarget(matrix, target))
    }
}