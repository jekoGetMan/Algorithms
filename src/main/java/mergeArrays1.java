import java.util.stream.Stream;
import java.util.Arrays;
public class mergeArrays1
{

    public static <T> Object[] mergeArray(T[] arr1, T[] arr2)
    {
        return Stream.of(arr1, arr2).flatMap(Stream::of).toArray();
    }
    public static void main (String[] args)
    {
        Integer[] firstArray = new Integer[]{1,2,3,4,5};
        Integer[] secondArray = new Integer[]{9,8,7};
        Object[] mergedArray = mergeArray(firstArray,secondArray);
        System.out.println("Merged array: "+ Arrays.toString(mergedArray));
    }
}
