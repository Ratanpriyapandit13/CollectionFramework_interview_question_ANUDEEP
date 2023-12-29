/** Find Length of ArrayList */

import java.util.ArrayList;

public class LengthOfArrayList {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Ratan");
        arrayList.add("Priya");
        arrayList.add("Pandit");

        // Find the length of the ArrayList
        int length = arrayList.size();

        // Print the length
        System.out.println("Length of ArrayList: " + length);
    }
}

/** 
 * OUTPUT
 * Length of ArrayList: 3
 */