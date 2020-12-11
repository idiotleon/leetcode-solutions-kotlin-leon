/**
 * https://leetcode.com/problems/invert-binary-tree/
 *
 * Time Complexity:     O(N)
 * Space Complexity:    O(H)
 *
 * References:
 *  https://mp.weixin.qq.com/s?__biz=MzAxODQxMDM0Mw==&mid=2247487126&idx=1&sn=4de13e66397bc35970963c5a1330ce18&chksm=9bd7f09eaca0798853c41fba05ad5fa958b31054eba18b69c785ae92f4bd8e4cc7a2179d7838&scene=21#wechat_redirect
 */
package com.zea7ot.leetcode.lvl2.lc0226

import com.zea7ot.leetcode.util.Constant.Annotation.Companion.UNUSED
import com.zea7ot.leetcode.util.dataStructure.tree.TreeNode

@Suppress(UNUSED)
class SolutionApproach0PostorderRecursive1 {
    fun invertTree(root: TreeNode?) = postorder(root)

    private fun postorder(node: TreeNode?): TreeNode? {
        if (node == null) return null

        postorder(node.left)
        postorder(node.right)

        val temp = node.left
        node.left = node.right
        node.right = temp

        return node
    }
}