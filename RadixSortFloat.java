import java.util.Arrays;

public class RadixSortFloat {
    private final double[] array;

    public RadixSortFloat(double[] array) {
        this.array = array;
    }

    public void countingSort(double exp)
    {
        int[] count = new int[10];
        double[] output = new double[array.length];

        for (double value : array) {
            count[(int) ((value / exp) % 10)]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--) {
            output[count[(int) ((array[i] / exp) % 10)] - 1] = array[i];
            count[(int) ((array[i] / exp) % 10)]--;
        }

        System.arraycopy(output, 0, array, 0, array.length);
    }

    void sort() {
        double max = Arrays.stream(array).max().getAsDouble();
        for (double exp = 1; max / exp > 0; exp *= 10) {
            countingSort(exp);
        }
    }
}

