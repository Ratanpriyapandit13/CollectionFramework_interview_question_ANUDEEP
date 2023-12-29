/** Remove At Specific Index in ArrayList */

import java.util.ArrayList;

public class RemoveValueAtIndex {
    public static void main(String[] args) {
        // Sample ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(61);
        arrayList.add(67);
        arrayList.add(98);
        arrayList.add(4);
        arrayList.add(75);

        // Print the befor remove value ArrayList
        System.out.println("ArrayList Before Remove : " + arrayList);
    
        // Remove the value at the specified index
        arrayList.remove(3);
                
        // Print the updated ArrayList
        System.out.println("Updated ArrayList: " + arrayList);
    }
}

//OUTPUT//
/**ArrayList Before Remove : [61, 67, 98, 4, 75]
Updated ArrayList: [61, 67, 98, 75]*/