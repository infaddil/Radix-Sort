import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
            int array[] = { 170, 45, 75, 90, 802, 24, 2, 66 };

            System.out.println("Unsorted Array");
            System.out.println(Arrays.toString(array) + "\n");

            // Function Call
            RadixSort radixSort = new RadixSort(array);
            radixSort.sort();
            System.out.println("Sorted Array");
            System.out.println(Arrays.toString(array));
        }
}