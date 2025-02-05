package com.idiotleon.leetcode.lvl4.lc0954

import org.junit.Test
import kotlin.test.assertFalse

class TestSolution0HashMap {
    val solution = SolutionApproach0HashMap()

    @Test
    fun test_NegativeInput_ShouldReturnExpected() {
        val input = intArrayOf(-5, -2)

        assertFalse(solution.canReorderDoubled(input))
    }
}