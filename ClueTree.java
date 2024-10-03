// class representing a node in the Clue Tree

class TreeNode {

    String clue; // The clue stored in this node

    TreeNode left, right; // References to the left and right child nodes



    // Constructor to initialize a new TreeNode with a given clue

    TreeNode(String clue) {

        this.clue = clue; // Set the clue for this node

        left = right = null; // Initialize left and right child references to null

    }

}



// Class representing a binary search tree for clues

public class ClueTree {

    private TreeNode root; // The root node of the Clue Tree



    // Insert a new clue into the tree

    public void insert(String clue) {

        root = insertRec(root, clue); // Start the recursive insertion from the root

    }



    // Recursive method to insert a clue in the tree

    private TreeNode insertRec(TreeNode root, String clue) {

        if (root == null) { // If the current position is null, we've found the spot to insert

            root = new TreeNode(clue); // Create a new TreeNode for the clue

            return root; // Return the new node

        }

        // Compare the clue with the current node's clue to determine the position

        if (clue.compareTo(root.clue) < 0) { // If the clue is less, go to the left subtree

            root.left = insertRec(root.left, clue); // Recursively insert into the left subtree

        } else if (clue.compareTo(root.clue) > 0) { // If the clue is greater, go to the right subtree

            root.right = insertRec(root.right, clue); // Recursively insert into the right subtree

        }

        return root; // Return the (potentially unchanged) root node

    }



    // Perform in-order traversal of the tree

    public void inOrder() {

        inOrderRec(root); // Start the recursive in-order traversal from the root

    }



    // Recursive method for in-order traversal

    private void inOrderRec(TreeNode root) {

        if (root != null) { // If the current node is not null

            inOrderRec(root.left); // Traverse the left subtree

            System.out.println(root.clue); // Print the clue of the current node

            inOrderRec(root.right); // Traverse the right subtree

        }

    }



    // Perform pre-order traversal of the tree

    public void preOrder() {

        preOrderRec(root); // Start the recursive pre-order traversal from the root

    }



    // Recursive method for pre-order traversal

    private void preOrderRec(TreeNode root) {

        if (root != null) { // If the current node is not null

            System.out.println(root.clue); // Print the clue of the current node

            preOrderRec(root.left); // Traverse the left subtree

            preOrderRec(root.right); // Traverse the right subtree

        }

    }



    // Perform post-order traversal of the tree

    public void postOrder() {

        postOrderRec(root); // Start the recursive post-order traversal from the root

    }



    // Recursive method for post-order traversal

    private void postOrderRec(TreeNode root) {

        if (root != null) { // If the current node is not null

            postOrderRec(root.left); // Traverse the left subtree

            postOrderRec(root.right); // Traverse the right subtree

            System.out.println(root.clue); // Print the clue of the current node

        }

    }



    // Find a specific clue in the tree

    public boolean findClue(String clue) {

        return findClueRec(root, clue); // Start the recursive search from the root

    }



    // Recursive method to search for a clue in the tree

    private boolean findClueRec(TreeNode root, String clue) {

        if (root == null) return false; // If the current node is null, the clue is not found

        if (clue.equals(root.clue)) return true; // If the clue matches the current node's clue, return true

        // Determine which subtree to search in based on the clue's comparison

        if (clue.compareTo(root.clue) < 0) return findClueRec(root.left, clue); // Search left

        return findClueRec(root.right, clue); // Search right

    }



    // Count the total number of clues in the tree

    public int countClues() {

        return countCluesRec(root); // Start counting from the root

    }



    // Recursive method to count clues in the tree

    private int countCluesRec(TreeNode root) {

        if (root == null) return 0; // If the current node is null, return 0

        // Count the current node and recurse on left and right children

        return 1 + countCluesRec(root.left) + countCluesRec(root.right);

    }

}
