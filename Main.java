import java.util.Arrays;

// Please remove comment to run the code depending on type of array

public class Main {

    public static void main(String[] args)
    {
    //      int array[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
            double array[] = { 170, 45.2, 75.69, 90.68, 802, 24, 2, 66 };

            System.out.println("Unsorted Array");
            System.out.println(Arrays.toString(array) + "\n");

            // Function Call
    //      RadixSort radixSort = new RadixSort(array);
            RadixSortFloat radixSort = new RadixSortFloat(array);
            radixSort.sort();
            System.out.println("Sorted Array");
            System.out.println(Arrays.toString(array));
        }
}