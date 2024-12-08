package com.csc;

public class OakTree {
}

// Node class representing each node in the binary tree
class Node {
  private Squirrel data;
  private Node left;
  private Node right;

  // Constructor to initialize a node with a Squirrel object
  public Node(Squirrel data) {
      this.data = data;
      this.left = null;
      this.right = null;
  }

  // Method to set the left child of this node
  public void setLeft(Node left) {
      this.left = left;
  }

  // Method to set the right child of this node
  public void setRight(Node right) {
      this.right = right;
  }

  // Method to get the left child of this node
  public Node left() {
      return this.left;
  }

  // Method to get the right child of this node
  public Node right() {
      return this.right;
  }

  // Method to get the data (Squirrel object) stored in this node
  public Squirrel getData() {
      return this.data;
  }
}

// Squirrel class as provided in the problem statement
class Squirrel {
  private String name;

  public Squirrel(String name) {
      this.name = name;
  }

  public String getName() {
      return this.name;
  }
}

