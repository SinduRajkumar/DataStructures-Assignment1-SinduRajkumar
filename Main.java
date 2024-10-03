public class Main {

    public static void main(String[] args) {

        // Testing ArtifactVault

        System.out.println("---- Artifact Vault ----");

        // Create an instance of ArtifactVault with a capacity of 5

        ArtifactVault vault = new ArtifactVault(5);

        

        // Add artifacts to the vault

        vault.addArtifact("Golden Idol");

        vault.addArtifact("Pharaoh's Mask");

        vault.addArtifact("Bronze Sword");

        

        // Print all artifacts currently in the vault

        vault.printArtifacts();

        

        // Remove an artifact from the vault

        vault.removeArtifact("Pharaoh's Mask");

        // Print the remaining artifacts after removal

        vault.printArtifacts();

        

        // Find an artifact using linear search and print its index

        int index = vault.findArtifactLinear("Golden Idol");

        System.out.println("Golden Idol found at index: " + index);

        

        // Find an artifact using binary search and print its index

        int binaryIndex = vault.findArtifactBinary("Golden Idol");

        System.out.println("Golden Idol found at index (binary search): " + binaryIndex);



        // Testing LabyrinthPath

        System.out.println("\n---- Labyrinth Path ----");

        // Create an instance of LabyrinthPath

        LabyrinthPath path = new LabyrinthPath();

        

        // Add locations to the labyrinth path

        path.addLocation("Entrance");

        path.addLocation("Chamber of Secrets");

        path.addLocation("Hidden Tomb");

        

        // Print the current path

        path.printPath();

        

        // Remove the last location from the path

        path.removeLastLocation();

        // Print the updated path after removal

        path.printPath();

        

        // Check if the path contains a loop and print the result

        boolean hasLoop = path.containsLoop();

        System.out.println("Path contains a loop: " + hasLoop);



        // Testing ScrollStack

        System.out.println("\n---- Scroll Stack ----");

        // Create an instance of ScrollStack

        ScrollStack stack = new ScrollStack();

        

        // Push scrolls onto the stack

        stack.pushScroll("Scroll of Wisdom");

        stack.pushScroll("Scroll of Fire");

        

        // Peek at the top scroll in the stack

        System.out.println("Top of the stack: " + stack.peekScroll());

        

        // Pop the top scroll from the stack

        stack.popScroll();

        // Peek again to show the new top scroll after popping

        System.out.println("After popping, top of the stack: " + stack.peekScroll());

        

        // Check if a specific scroll is in the stack and print the result

        boolean contains = stack.containsScroll("Scroll of Fire");

        System.out.println("Scroll of Fire is in the stack: " + contains);



        // Testing ExplorerQueue

        System.out.println("\n---- Explorer Queue ----");

        // Create an instance of ExplorerQueue with a capacity of 3

        ExplorerQueue queue = new ExplorerQueue(3);

        

        // Enqueue explorers to the queue

        queue.enqueue("Explorer 1");

        queue.enqueue("Explorer 2");

        queue.enqueue("Explorer 3");

        

        // Peek at the next explorer in line

        System.out.println("Next explorer in line: " + queue.peek());

        

        // Dequeue explorers and print who entered the temple

        System.out.println(queue.dequeue() + " entered the temple.");

        System.out.println(queue.dequeue() + " entered the temple.");

        

        // Peek again to show the next explorer in line

        System.out.println("Next explorer in line: " + queue.peek());

        

        // Enqueue another explorer to the queue

        queue.enqueue("Explorer 4");

        // Peek to show the updated next explorer in line

        System.out.println("Next explorer in line: " + queue.peek());



        // Testing ClueTree

        System.out.println("\n---- Clue Tree ----");

        // Create an instance of ClueTree

        ClueTree tree = new ClueTree();

        

        // Insert clues into the clue tree

        tree.insert("Clue 1");

        tree.insert("Clue 3");

        tree.insert("Clue 2");

        

        // Perform and print the results of different tree traversals

        System.out.println("In-order traversal:");

        tree.inOrder(); // Updated method name to match the ClueTree class

        System.out.println("Pre-order traversal:");

        tree.preOrder(); // Updated method name to match the ClueTree class

        System.out.println("Post-order traversal:");

        tree.postOrder(); // Updated method name to match the ClueTree class

        

        // Check if a specific clue is found and print the result

        boolean found = tree.findClue("Clue 3");

        System.out.println("Clue 3 found: " + found);

        

        // Count the total number of clues and print the result

        int totalClues = tree.countClues();

        System.out.println("Total clues: " + totalClues);

    }

}

