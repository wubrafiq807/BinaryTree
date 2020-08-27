package com.rafiq.binaryTree;

import java.util.Scanner;

public class BinaryTreeUtility {
	public Scanner myScanner = new Scanner(System.in);

	public Node create() {
		System.out.println("Enter the data(0 for no Node):");
		String input = myScanner.nextLine();

		while (!isObjectInteger(input)) {
			System.err.println("Invalid integer:");
			input = myScanner.nextLine();
		}

		Integer data = Integer.parseInt(input);
		if (data == 0) {
			return null;
		}
		Node newNode = new Node(data);

		System.out.println("Please enter the left child of " + data + ":");
		newNode.left = create();
		System.out.println("Please enter the right child of " + data + ":");
		newNode.right = create();
		return newNode;
	}

	public void traverseInOrder(Node node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.print(" " + node.data);
			traverseInOrder(node.right);
		}
	}

	public void traversePreOrder(Node node) {
		if (node != null) {
			System.out.print(" " + node.data);
			traverseInOrder(node.left);
			traverseInOrder(node.right);
		}
	}

	public void traversePostOrder(Node node) {
		if (node != null) {
			traverseInOrder(node.left);
			traverseInOrder(node.right);
			System.out.print(" " + node.data);
		}
	}

	public boolean isObjectInteger(String number) {
		try {
			Integer.parseInt(number);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}
