package com.codingquestions.pathsum;

public class PathSum {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(6);
        treeNode.left = new TreeNode(5);
        treeNode.right = new TreeNode(9);
        treeNode.left.left = new TreeNode(12);
        treeNode.right.left = new TreeNode(14);
        treeNode.right.right = new TreeNode(5);
        treeNode.left.left.left = new TreeNode(8);
        treeNode.left.left.right = new TreeNode(3);
        treeNode.right.right.right = new TreeNode(2);

        System.out.println(hasPathSum(treeNode, 222));
    }

    private static boolean hasPathSum(TreeNode treeNode, int sum) {
        if (treeNode == null) {
            return false;
        } else if (treeNode.left == null && treeNode.right == null && sum - treeNode.val == 0) {
            return true;
        } else {
            return hasPathSum(treeNode.left, sum - treeNode.val) || hasPathSum(treeNode.right, sum - treeNode.val);
        }
    }
}
