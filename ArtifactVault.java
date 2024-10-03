import java.util.Arrays; // Importing the Arrays class for array manipulation



public class ArtifactVault 

{

	// Array to hold the artifacts

    private String[] artifacts; 

    // Current number of artifacts stored in the vault

    private int size; 



    // Constructor to initialize the vault with a given capacity

    public ArtifactVault(int capacity) 

    {

    	// Allocate the array based on specified capacity

        artifacts = new String[capacity]; 

        // Initialize the size to zero

        size = 0; 

    }



    // Add an artifact to the first empty slot in the vault

    public void addArtifact(String artifact) 

    {

        if (size < artifacts.length) 

        { 

        	// Check if there's space in the vault

            artifacts[size] = artifact; // Place the new artifact in the next empty slot

            size++; // Increment the size to reflect the new artifact added

        } 

        else 

        {

            // If the vault is full, print a message indicating the failure

            System.out.println("Vault is full, cannot add more artifacts.");

        }

    }



    // Remove an artifact by its name

    public void removeArtifact(String artifact) 

    {

        // Iterate through the artifacts to find the specified one

        for (int i = 0; i < size; i++) 

        {

            if (artifacts[i].equals(artifact)) 

            { // If the artifact matches

                artifacts[i] = artifacts[size - 1]; // Replace it with the last artifact

                artifacts[size - 1] = null; // Clear the last artifact slot

                size--; // Decrement the size of the vault

                System.out.println("Artifact " + artifact + " removed."); // Notify the user

                return; // Exit the method after removal

            }

        }

        // If the artifact is not found, notify the user

        System.out.println("Artifact not found.");

    }



    // Find an artifact using linear search

    public int findArtifactLinear(String artifact) 

    {

        // Iterate through the artifacts to find the specified one

        for (int i = 0; i < size; i++) 

        {

            if (artifacts[i].equals(artifact)) 

            { // If the artifact matches

                return i; // Return the index where the artifact is found

            }

        }

        return -1; // Return -1 if the artifact is not found

    }



    // Sort artifacts before doing binary search

    public void sortArtifacts() 

    {

        Arrays.sort(artifacts, 0, size); // Sort the artifacts array from index 0 to the current size

    }



    // Find an artifact using binary search (assuming the array is sorted)

    public int findArtifactBinary(String artifact) 

    {

        sortArtifacts(); // Ensure the array is sorted before searching

        int left = 0; // Initialize the left boundary of the search

        int right = size - 1; // Initialize the right boundary of the search



        // Perform binary search

        while (left <= right) 

        {

            int mid = (left + right) / 2; // Find the middle index

            int comparison = artifacts[mid].compareTo(artifact); // Compare the mid artifact with the target artifact



            if (comparison == 0) 

            {

                return mid; // Artifact found at mid index

            } else if (comparison < 0) 

            {

                left = mid + 1; // Search in the right half

            } else 

            {

                right = mid - 1; // Search in the left half

            }

        }

        return -1; // Return -1 if the artifact is not found

    }



    // Print all artifacts currently in the vault

    public void printArtifacts() 

    {

        // Iterate through the artifacts and print each one

        for (int i = 0; i < size; i++) 

        {

            System.out.println(artifacts[i]);

        }

    }

}


