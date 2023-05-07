import java.util.Arrays;

public class RadixSort {
    // declare integer array variable that the value won't change and can't be
    // accessed outside of this class
    private final int[] array;

    // define RadixSort with array variable as argument
    public RadixSort(int[] array) {
        // update the current element as new array variable
        this.array = array;
    }

    // define countingSort method
    public void countingSort(int currentdigit) {
        // declare the count and output variables
        int[] count = new int[10];
        int[] output = new int[array.length];

        //looping over each element in the integer array array
        for (int value : array) {
            //increment the count of the next digit
            count[(value / currentdigit) % 10]++;
        }
        //
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        
        for (int i = array.length - 1; i >= 0; i--) {
            output[count[(array[i] / currentdigit) % 10] - 1] = array[i];
            count[(array[i] / currentdigit) % 10]--;
        }

        System.arraycopy(output, 0, array, 0, array.length);
    }

    void sort() {
        int max = Arrays.stream(array).max().getAsInt();
        for (int currentdigit = 1; max / currentdigit > 0; currentdigit *= 10) {
            countingSort(currentdigit);
        }
    }
}
