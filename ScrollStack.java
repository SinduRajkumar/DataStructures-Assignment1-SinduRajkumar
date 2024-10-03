import java.util.Stack; // Importing the Stack class from the java.util package



public class ScrollStack {

    private Stack<String> stack; // Stack to hold scroll titles



    // Constructor to initialize the ScrollStack

    public ScrollStack() {

        stack = new Stack<>(); // Create a new Stack instance

    }



    // Push a new scroll onto the stack

    public void pushScroll(String scroll) {

        stack.push(scroll); // Add the scroll title to the top of the stack

    }



    // Pop the top scroll off the stack

    public String popScroll() {

        if (stack.isEmpty()) { // Check if the stack is empty

            return "Stack is empty!"; // Return a message if the stack is empty

        }

        return stack.pop(); // Remove and return the top scroll title from the stack

    }



    // Peek at the top scroll without removing it

    public String peekScroll() {

        if (stack.isEmpty()) { // Check if the stack is empty

            return "Stack is empty!"; // Return a message if the stack is empty

        }

        return stack.peek(); // Return the top scroll title without removing it

    }



    // Check if a specific scroll title exists in the stack

    public boolean containsScroll(String scroll) {

        return stack.contains(scroll); // Return true if the scroll title is found, false otherwise

    }

}
