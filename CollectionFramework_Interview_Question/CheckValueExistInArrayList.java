/** Check Value Exist in ArrayList */

import java.util.ArrayList;

public class CheckValueExistInArrayList {
    public static void main(String[] args) {
        // Sample ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        // Value to check
        int valueToCheck = 30;
        
        // Check if the value exists
        if (arrayList.contains(valueToCheck)) {
            System.out.println("Value Exist : " + valueToCheck );
        } else {
            System.out.println("Value Not Exist :" + valueToCheck );
        }
    }
}

/**
 * OUTPUT 
 * Value Exist :30
 */