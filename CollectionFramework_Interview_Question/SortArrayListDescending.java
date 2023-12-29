/**sort arraylist in descending order */

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListDescending {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("orange");
        arrayList.add("grape");
        arrayList.add("kiwi");
        arrayList.add("mango");

        // Sort the ArrayList in descending order
        Collections.sort(arrayList, Collections.reverseOrder());

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList in descending order: " + arrayList);
    }
}


///OUTPUT///
//Sorted ArrayList in descending order: [orange, mango, kiwi, grape, banana, apple]
