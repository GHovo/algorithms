package com.company.tree;

public class Node {

    int value;
    Tree.Node left, right;

    Node(int value){
        this.value = value;
        left = null;
        right = null;
    }

    public static class Main {

        public static void main(String[] args) {
            Tree tree = new Tree();
            Tree.Node root = new Tree.Node(5);
            System.out.println("Binary Tree Example");
            System.out.println("Building tree with root value " + root.value);
            tree.insert(root, 2);
            tree.insert(root, 4);
            tree.insert(root, 8);
            tree.insert(root, 6);
            tree.insert(root, 7);
            tree.insert(root, 3);
            tree.insert(root, 9);
            System.out.println("Traversing tree in order");
            tree.traverseInOrder(root);
        }
    }
}
