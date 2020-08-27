package com.rafiq.binaryTree;

import java.awt.Robot;

public class BinaryTreeDemo {
	static BinaryTreeUtility binaryTreeUtility = new BinaryTreeUtility();
	public static void main(String[] args) {
		 Node root = null;
		 root = binaryTreeUtility.create();
		 System.out.println("Traverse inorder:");
		  binaryTreeUtility.traverseInOrder(root);
		  System.out.println();
		  System.out.println("Traverse preorder:");
		  binaryTreeUtility.traversePreOrder(root);
		  System.out.println();
		  System.out.println("Traverse Post order:");
		  binaryTreeUtility.traversePostOrder(root);
	}
}
