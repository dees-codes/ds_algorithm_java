package academy.learnprogramming.arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[]{20, 35, -15, 7, 55, 1, -22};
        bubbleSort(intArray);
    }

    // While doing time complexity, we're not doing maths. But instead we're trying to get some sense of how the number
    // of steps grows as the number of items we're dealing with grows
    // The algorithm grows in a quadratic way as the number of item increases. The pattern is quadratic.
    // O to the n square time complexity.
    public static void bubbleSort(int[] intArray) {
        for (int unsortedPartitionIndex = intArray.length - 1; unsortedPartitionIndex > 0; unsortedPartitionIndex--) {
            for (int i = 0; i < unsortedPartitionIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        System.out.print("Sorted Array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }

    public static void swap(int[] intArray, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = intArray[i];
        intArray[i] = intArray[i + 1];
        intArray[i + 1] = temp;
    }

}
