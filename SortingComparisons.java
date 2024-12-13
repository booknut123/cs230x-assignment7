
/**
 * Driver to run several sorting algorithms on several random data
 * (e.g., 10K-150K integers) and record their running times. 
 * The results can be used to plot and compare.
 *
 * @author Kailyn Lau
 * @version v1.0
 */
public class SortingComparisons
{
    public static void main(){
        long NANOSECONDS_PER_SECOND = 1_000_000_000;   // A billionth of a second (10^9), _ is ignored by Java but helps humans to read the number
        Integer[] dataorig = Sorting.generateRandomArray(100000);

        Integer[] data = Sorting.copyArray(dataorig);
        long start = System.nanoTime();
        Sorting.selectionSort(data);
        long end = System.nanoTime();
        long durationInNanoseconds = end - start;
        System.out.println("Selection Sort took " + durationInNanoseconds/Math.pow(10,9)+ " seconds.");

        data = Sorting.copyArray(dataorig);
        start = System.nanoTime();
        Sorting.insertionSort(data);
        end = System.nanoTime();
        durationInNanoseconds = end - start;
        System.out.println("Insertion Sort took " + durationInNanoseconds/Math.pow(10,9)+ " seconds.");

        data = Sorting.copyArray(dataorig);
        start = System.nanoTime();
        Sorting.mergeSort(data, 0, data.length - 1);
        end = System.nanoTime();
        durationInNanoseconds = end - start;
        System.out.println("Merge Sort took " + durationInNanoseconds/Math.pow(10,9)+ " seconds.");

        data = Sorting.copyArray(dataorig);
        start = System.nanoTime();
        Sorting.quickSort(data, 0, data.length - 1);
        end = System.nanoTime();
        durationInNanoseconds = end - start;
        System.out.println("Quick Sort took " + durationInNanoseconds/Math.pow(10,9)+ " seconds.");
    }
}
