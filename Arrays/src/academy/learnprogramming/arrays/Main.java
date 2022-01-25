package academy.learnprogramming.arrays;

public class Main {

    public static void main(String[] args) {
        // Arrays are not dynamic, once created the size is fixed. We can't increase or decrease it's size which leads to
        // some disadvantages compared to other disadvantages.
        int[] intArray = new int[7];
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }

        // Arrays are stored in contiguous blocks in memory
        // Every element in array occupies the same amount of space in memory

        // Every int occupies 4 bytes in memory
        // In array of objects, like Strings, what's stored in the array is reference to objects.

        // Arrays can retrieve elements, if we know the index, in constant time O(1)

        // To find index for a particular element
        int index = -1;
        for (int i = 0; i < intArray.length; i++){
            if (intArray[i] == 7) {
                index = i;
                break;
            }
        }
        System.out.println("index " + index);
        // Worst case is 7 was in the last index. We'd have to iterate 7 times. Time complexity O(n)

        // Retrieving with index O(1)
        // Retrieving without index O(n)
        // Add an element to a full array O(n) as creating a new array and copying all existing element requires us to loop over O(n) times
        // Add an element to the end of an array having space O(1)
        // Insert or update an element at a specific index O(1)
        // Deleting an element by setting it to null O(1)
        // Deleting an element by shifting elements O(n)

        // If we have to loop over an array -> linear time complexity
        // If we don't have to loop because we have index for instant access -> constant time access
    }
}
