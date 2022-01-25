package academy.learnprogramming.arrays;

public class BubbleSort {
    //  20, 35, -15, 7, 55, 1, -22
    // unsorted partition index: 6

    // i = 0    20, 35, -15, 7, 55, 1, -22
    // i = 1    20, -15, 35, 7, 55, 1, -22
    // i = 2    20, -15, 7, 35, 55, 1, -22
    // i = 3    20, -15, 7, 35, 55, 1, -22
    // i = 4    20, -15, 7, 35, 1, 55, -22
    // i = 5    20, -15, 7, 35, 1, -22, 55

    // During each traversal of an array, the last element of an array is in it's correct position
    // n^2 time complexity, inner loop compares every two element and outer loop loops through the array. This way, the largest element
    // bubbles up to the end of the array.

    // unsorted partition index: 5
    // Everything to the right of the unsorted partition index is sorted
    // Everything to the left of the unsorted partition index including the element at the unsorted partition index is unsorted

    // i = 0    -15, 20, 7, 35, 1, -22, 55
    // i = 1    -15, 7, 20, 35, 1, -22, 55
    // i = 2    -15, 7, 20, 35, 1, -22, 55
    // i = 3    -15, 7, 20, 1, 35, -22, 55
    // i = 4    -15, 7, 20, 1, -22, 35, 55

    // Largest value will bubble up to the end of the array
    // We do the outer iteration until unsortedPartitionIndex = 0

    // In-place algorithm because we don't use any extra memory space for doing tasks like saving a copy of the array
    // We use variables but it's number doesn't increase with respect to the number of array elements

    // Algorithm degrades quickly as time complexity is quadratic
}
