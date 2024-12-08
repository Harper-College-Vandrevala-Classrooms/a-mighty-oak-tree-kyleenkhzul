package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestOakTree {

    Node root;
    Node leftChild;
    Node rightChild;

    @BeforeEach
    void setUp() {
        // Initialize the nodes with Squirrel objects
        root = new Node(new Squirrel("Cheeks"));
        leftChild = new Node(new Squirrel("Squeaks"));
        rightChild = new Node(new Squirrel("Mr. Fluffy Butt"));
    }

    @Test
    void testNodeStoresSquirrel() {
        // Verify that the node stores the correct Squirrel object
        assertEquals("Cheeks", root.getData().getName());
    }

    @Test
    void testAttachLeftChild() {
        // Attach left child and verify
        root.setLeft(leftChild);
        assertEquals("Squeaks", root.left().getData().getName());
    }

    @Test
    void testAttachRightChild() {
        // Attach right child and verify
        root.setRight(rightChild);
        assertEquals("Mr. Fluffy Butt", root.right().getData().getName());
    }

    @Test
    void testLeftAndRightAreNullByDefault() {
        // Verify that left and right children are null initially
        assertNull(root.left());
        assertNull(root.right());
    }

    @Test
    void testTreeStructure() {
        // Create a tree and verify its structure
        root.setLeft(leftChild);
        root.setRight(rightChild);

        assertEquals("Squeaks", root.left().getData().getName());
        assertEquals("Mr. Fluffy Butt", root.right().getData().getName());
        assertNull(leftChild.left());
        assertNull(leftChild.right());
        assertNull(rightChild.left());
        assertNull(rightChild.right());
    }
}
