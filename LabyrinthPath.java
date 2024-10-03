// Class representing a single node in the linked list

class Node {

    String data; // Data stored in the node

    Node next;   // Pointer to the next node in the linked list



    // Constructor to initialize the node with data

    Node(String data) {

        this.data = data; // Set the data

        this.next = null; // Initialize next as null

    }

}



public class LabyrinthPath {

    private Node head; // Head of the linked list representing the path



    // Constructor to initialize an empty path

    public LabyrinthPath() {

        head = null; // Initialize head to null

    }



    // Add a new location to the end of the path

    public void addLocation(String location) {

        Node newNode = new Node(location); // Create a new node with the location

        if (head == null) { // If the path is empty

            head = newNode; // Set the new node as the head

        } else {

            Node current = head; // Start from the head

            // Traverse to the end of the linked list

            while (current.next != null) {

                current = current.next; // Move to the next node

            }

            // Add the new node to the end of the list

            current.next = newNode;

        }

    }



    // Remove the last visited location from the path

    public void removeLastLocation() {

        if (head == null) { // If the path is empty

            System.out.println("Path is empty, nothing to remove."); // Notify user

            return; // Exit the method

        }

        if (head.next == null) { // If there's only one node in the list

            head = null; // Set head to null, effectively removing the node

        } else {

            Node current = head; // Start from the head

            // Traverse to the second last node

            while (current.next.next != null) {

                current = current.next; // Move to the next node

            }

            current.next = null; // Remove the last node

        }

    }



    // Print the entire path

    public void printPath() {

        if (head == null) { // If the path is empty

            System.out.println("Path is empty."); // Notify user

            return; // Exit the method

        }

        Node current = head; // Start from the head

        System.out.println("Labyrinth Path:"); // Print header

        // Traverse and print each location in the path

        while (current != null) {

            System.out.print(current.data + " -> "); // Print the current location

            current = current.next; // Move to the next node

        }

        System.out.println("null"); // Indicate the end of the path

    }



    // Check if the path contains a loop (trap)

    public boolean containsLoop() {

        Node slow = head; // Slow pointer starts at the head

        Node fast = head; // Fast pointer also starts at the head



        // Traverse the linked list with two pointers

        while (fast != null && fast.next != null) {

            slow = slow.next; // Move slow pointer one step

            fast = fast.next.next; // Move fast pointer two steps

            // If slow and fast pointers meet, a loop exists

            if (slow == fast) {

                return true; // Loop found

            }

        }

        return false; // No loop found

    }

}

