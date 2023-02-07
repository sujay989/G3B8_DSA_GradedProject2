package com.greatlearning.driver;

import com.greatlearning.services.BSTToSkewedTree;
import com.greatlearning.services.Node;

public class Main {

	public static void main(String[] args) {

		BSTToSkewedTree tree = new BSTToSkewedTree();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		int order = 0;
		tree.flattenBTToSkewed(tree.node, order);
		tree.traverseRightSkewed(tree.headNode);
	}
}
