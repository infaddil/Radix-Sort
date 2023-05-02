import java.util.Arrays;


public class Main {

    public static void main(String[] args)
    {
        int intArray[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        double douArray[] = { 170, 45.2, 75.69, 90.68, 802, 24, 2, 66 };

        System.out.println("Unsorted Array");
        System.out.println("Int: " + Arrays.toString(intArray));
        System.out.println("Double: " + Arrays.toString(douArray) + "\n");

        // Function Call
        RadixSort radixSortInt = new RadixSort(intArray);
        RadixSortFloat radixSortDouble = new RadixSortFloat(douArray);
        radixSortInt.sort();
        radixSortDouble.sort();

        //Displaying Results
        System.out.println("Sorted Array");
        System.out.println("Int: " + Arrays.toString(intArray));
        System.out.println("Double: " + Arrays.toString(douArray) + "\n");
    }
}
