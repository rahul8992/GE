/*
 * GE Test Java program
 * Rahul Rajput
 */
import java.util.Scanner;

public class Tree {

	static class Node {
		int key;
		Node left, right;

		Node(int key) {
			this.key = key;
			left = null;
			right = null;
		}
	}

	static Node root;

	public static boolean isPresent(int x) {
		return present(root, x);
	}

	public static boolean present(Node currentNode, int x) {
		if (currentNode != null) {

			if (currentNode.key == x) {
				return true;
			} else {
				return present(currentNode.left, x)
						|| present(currentNode.right, x);
			}
		}
		return false;
	}

	public static void main(String args[]) {
		root = new Node(2);
		root.left = new Node(7);
		root.left.left = new Node(2);
		root.right = new Node(5);
		root.left.right = new Node(6);
		root.right.right = new Node(9);
		root.left.right.left = new Node(5);
		root.left.right.right = new Node(11);
		root.right.right.left = new Node(4);
		System.out.print("Enter value do you want to search ");
		Scanner sc = new Scanner(System.in);
		int search = sc.nextInt();
		System.out.print(isPresent(search));

	}
}
