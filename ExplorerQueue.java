public class ExplorerQueue {

    private String[] queue; // Array to store the elements of the queue

    private int front, rear, size, capacity; // Variables to track front, rear, current size, and capacity of the queue



    // Constructor to initialize the queue with a specified capacity

    public ExplorerQueue(int capacity) {

        this.capacity = capacity; // Set the maximum capacity of the queue

        queue = new String[capacity]; // Create an array to hold the queue elements

        front = size = 0; // Initialize front and size to 0

        rear = capacity - 1; // Initialize rear to the last index of the array

    }



    // Check if the queue is full

    public boolean isFull() {

        return size == capacity; // Returns true if size is equal to capacity, indicating the queue is full

    }



    // Check if the queue is empty

    public boolean isEmpty() {

        return size == 0; // Returns true if size is 0, indicating the queue is empty

    }



    // Enqueue new explorer to the queue

    public void enqueue(String explorer) {

        if (isFull()) { // Check if the queue is full

            System.out.println("Queue is full."); // Print message if the queue cannot accept more explorers

            return; // Exit the method

        }

        rear = (rear + 1) % capacity; // Update rear index circularly

        queue[rear] = explorer; // Add the new explorer at the rear of the queue

        size++; // Increment the size of the queue

        System.out.println(explorer + " has been added to the queue."); // Print confirmation message

    }



    // Dequeue explorers when they enter the temple

    public String dequeue() {

        if (isEmpty()) { // Check if the queue is empty

            return "Queue is empty."; // Return a message if there's nothing to dequeue

        }

        String explorer = queue[front]; // Get the explorer at the front of the queue

        front = (front + 1) % capacity; // Update front index circularly

        size--; // Decrease the size of the queue

        return explorer + " has entered the temple."; // Return the explorer's name and confirmation message

    }



    // Display the next explorer in line without removing them

    public String peek() {

        if (isEmpty()) { // Check if the queue is empty

            return "Queue is empty."; // Return a message if there's no one to peek at

        }

        return queue[front] + " is next in line."; // Return the explorer at the front of the queue

    }

}

