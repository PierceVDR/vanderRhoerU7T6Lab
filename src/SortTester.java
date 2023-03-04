import java.util.Arrays;

public class SortTester {
    public static void main(String[] args) {
//        System.out.println("--- SELECTION SORT --- ");
//        int[] arr1 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
//        // note the selectionSort method modifies the original array (rather than returning a new array that is sorted)
//        Sort.selectionSort(arr1);
//        System.out.println(Arrays.toString(arr1));
//
//        System.out.println("\n--- INSERTION SORT --- ");
//        int[] arr2 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
//        // note the insertionSort method modifies the original array (rather than returning a new array that is sorted)
//        Sort.insertionSort(arr2);
//        System.out.println(Arrays.toString(arr2));

            System.out.println("--- SELECTION SORT DESCENDING --- ");
            int[] arr1 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
            // note the selectionSort method modifies the original array (rather than returning a new array that is sorted)
            Sort.selectionSortDescending(arr1);
            System.out.println(Arrays.toString(arr1));

            System.out.println("\n--- INSERTION SORT DESCENDING --- ");
            int[] arr2 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
            // note the insertionSort method modifies the original array (rather than returning a new array that is sorted)
            Sort.insertionSortDescending(arr2);
            System.out.println(Arrays.toString(arr2));
        }
}