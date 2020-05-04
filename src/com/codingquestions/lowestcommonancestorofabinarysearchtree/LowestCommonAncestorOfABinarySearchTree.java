package com.codingquestions.lowestcommonancestorofabinarysearchtree;

public class LowestCommonAncestorOfABinarySearchTree {
    //Given a binary search tree(BST), find the lowest common ancestor(LCA) of two given nodes in the BST.
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(6);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(8);
        treeNode.left.left = new TreeNode(0);
        treeNode.right.left = new TreeNode(7);
        treeNode.right.right = new TreeNode(9);
        treeNode.left.right = new TreeNode(4);
        treeNode.left.right.right = new TreeNode(5);
        treeNode.left.right.left = new TreeNode(3);

        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);

        System.out.println(lowestCommonAncestor(treeNode, p, q));
    }

    private static int lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return root.val;
        }
    }
}
