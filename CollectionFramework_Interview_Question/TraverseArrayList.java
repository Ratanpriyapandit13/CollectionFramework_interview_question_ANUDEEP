/** Traverse In Array list */
import java.util.ArrayList;

public class TraverseArrayList {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> al = new ArrayList<>();

        // Add elements to the ArrayList
        al.add("Apple");
        al.add("Banana");
        al.add("Orange");
        al.add("Grapes");

        // Traverse the ArrayList using a for loop
        System.out.println("ArrayList elements:");

        for (String each_element : al) {
            System.out.print(each_element +" ");
        }
    }
}

/**
 * OUTPUT
 * 
 * ArrayList elements:
 * Apple Banana Orange Grapes 
 */