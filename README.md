A. ArtifactVault Challenge Description:

Challenge: 
Create a class, ArtifactVault, to manage a collection of ancient artifacts using an array.

Goals:
1. Add artifacts.
2. Remove artifacts by name.
3. Search artifacts using linear and binary search methods.

Approach:
Defined the ArtifactVault class with an array to store artifacts and a variable to track the count.

Implemented key methods:
1. addArtifact(String artifact): Adds an artifact to the next available slot in the array.
2. removeArtifact(String name): Utilizes linear search to find and remove an artifact by name, shifting subsequent artifacts.
3. findArtifactLinear(String name): Implements linear search to locate an artifact.
4. findArtifactBinary(String name): Uses binary search assuming the artifacts are sorted.
5. printArtifacts(): Displays the current artifacts in the vault.

Assumptions and Design Decisions:
1. Assumed artifact names correlate with their historical significance, hence sorting by name is the primary criterion.
2. The array has a fixed size; no new artifacts can be added without removing an existing one.
3. Integrated sorting into addArtifact to maintain order for binary search efficiency.

Running the Code:
1. Copy the code into a new file named ArtifactVault.java.
2. Compile and run the code.






      
B. LabyrinthPath Challenge Description:

Challenge: 
Create a class, LabyrinthPath, to represent and manage a path through a labyrinth using a linked list.

Goals:
1. Add locations to the path.
2. Remove the last visited location.
3. Print the entire path.
4. Detect if the path contains loops.

Approach:
Defined the LabyrinthPath class with a nested Node class for each location.

Implemented key methods:
1. addLocation(String location): Adds a new location to the end of the linked list.
2. removeLastLocation(): Removes the most recently added location.
3. printPath(): Displays the entire path through the labyrinth.
4. containsLoop(): Uses Floyd’s Cycle Detection algorithm to check for loops in the path.

Assumptions and Design Decisions:
1. Assumed each location is unique and the path can be traversed linearly.
2. Chose a linked list for dynamic memory capabilities, allowing easy addition/removal of locations.
3. Implemented loop detection to handle potential revisits to locations in the labyrinth.

Running the Code:
1. Copy the code into a new file named LabyrinthPath.java.
2. Compile and run the code.







C. ScrollStack Challenge Description:

Challenge: 
Create a class, ScrollStack, to manage a stack of scrolls using Java's built-in Stack class.

Goals:
1. Push new scrolls onto the stack.
2. Pop the top scroll off the stack.
3. Peek at the top scroll without removing it.
4. Check if a specific scroll exists in the stack.

Approach:
Defined the ScrollStack class utilizing Java’s Stack class for stack operations.

Implemented key methods:
1. pushScroll(String scroll): Adds a new scroll to the top of the stack.
2. popScroll(): Removes and returns the top scroll.
3. peekScroll(): Returns the top scroll without removing it.
4. containsScroll(String scroll): Checks if a specific scroll is present in the stack.

Assumptions and Design Decisions:
1. Assumed scrolls are unique, and the stack adheres to LIFO (Last In, First Out) principle.
2. Leveraged Java's Stack class to simplify stack operations and ensure robustness.

Running the Code:
1. Copy the code into a new file named ScrollStack.java.
2. Compile and run the code








D. ExplorerQueue Challenge Description:

Challenge: 
Create a class, ExplorerQueue, to manage a queue of explorers entering a temple using a circular array.

Goals:
1. Enqueue new explorers.
2. Dequeue explorers when they enter the temple.
3. Peek at the next explorer in line.

Approach:
Defined the ExplorerQueue class using an array for queue management.

Implemented key methods:
1. isFull(): Checks if the queue is full.
2. isEmpty(): Checks if the queue is empty.
3. enqueue(String explorer): Adds a new explorer to the queue.
4. dequeue(): Removes and returns the explorer at the front of the queue.
5. peek(): Returns the next explorer in line without removing them.

Assumptions and Design Decisions:
1. Assumed a fixed capacity for the queue, limiting the number of explorers.
2. Implemented a circular array to optimize space and ensure efficient enqueue and dequeue operations.

Running the Code:
1. Copy the code into a new file named ExplorerQueue.java.
2. Compile and run the code







E. ClueTree Challenge Description:
Challenge: 
Create a class, ClueTree, to manage a binary search tree of clues.

Goals:
1. Insert new clues.
2. Perform in-order, pre-order, and post-order traversals.
3. Find a specific clue.
4. Count the total number of clues.

Approach:
Defined the ClueTree class with a nested TreeNode class to represent each clue.

Implemented key methods:
1. insert(String clue): Adds a new clue to the tree.
2. inOrder(): Performs an in-order traversal of the tree.
3. preOrder(): Performs a pre-order traversal of the tree.
4. postOrder(): Performs a post-order traversal of the tree.
5. findClue(String clue): Searches for a specific clue in the tree.
6. countClues(): Counts the total number of clues in the tree.

Assumptions and Design Decisions:
1. Assumed clues are unique and can be organized hierarchically.
2. Implemented a binary search tree for efficient clue management, allowing for quick insertions and searches.

Running the Code:
1. Copy the code into a new file named ClueTree.java.
2. Compile and run the code
