import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Part 1: Using an Array to Store Student Names

        // Initializing an array with a fixed size of 5
        String[] studentArray = new String[5];
        studentArray[0] = "Jessica";
        studentArray[1] = "Bryan";
        studentArray[2] = "David";
        studentArray[3] = "Carl";
        studentArray[4] = "Justin";

        // Trying to add another student (will not work because the array size is fixed)
        // studentArray[5] = "Joseph"; // Uncommenting this line will cause an error

        // Modifying an existing student name
        studentArray[1] = "Bry"; // Changing "Bryan" to "Bry"

        // Printing the array elements
        System.out.println("Array of Student Names:");
        for (int i = 0; i < studentArray.length; i++) {
            System.out.println(studentArray[i]);
        }


        // Initializing an ArrayList with no initial size required
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Jessica");
        studentList.add("Bryan");
        studentList.add("David");
        studentList.add("Carl");
        studentList.add("Justin");

        // Adding another student (works because the ArrayList can resize dynamically)
        studentList.add("Joseph");

        // Removing a student
        studentList.remove("Carl"); // Removes "Carl" from the list

        // Modifying an existing student name
        studentList.set(1, "Bry"); // Changing "Bryan" to "Bry"

        // Printing the ArrayList elements
        System.out.println("\nArrayList of Student Names:");
        for (String student : studentList) {
            System.out.println(student);
        }

        // Summary of Differences
        System.out.println("\nSummary of Differences:");
        System.out.println("1. Arrays have a fixed size, which limits adding new elements.");
        System.out.println("2. ArrayLists can dynamically resize, allowing more flexibility in adding/removing elements.");
        System.out.println("3. Modifying elements is straightforward in both, but ArrayLists offer more built-in methods for ease of use.");
    }
}