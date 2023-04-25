import java.util.Arrays;

public class RadixSort {
    private final int[] array;

    public RadixSort(int[] array)
    {
        this.array = array;
    }

    public void countingSort(int exp)
    {

        int[] count = new int[10];
        int[] output = new int[array.length];

        for (int value : array)
        {
            count[(value / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++)
        {
            count[i] += count[i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--)
        {
            output[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }

        System.arraycopy(output, 0, array, 0, array.length);
    }

    void sort()
    {
        int max = Arrays.stream(array).max().getAsInt();
        for (int exp = 1; max / exp > 0; exp *= 10)
        {
            countingSort(exp);
        }
    }
}
