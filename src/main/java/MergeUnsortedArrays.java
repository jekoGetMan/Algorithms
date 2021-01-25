import java.util.Arrays;

public class MergeUnsortedArrays {

    public static int[] mergeUnsortedArrays(int[] arr1, int arr2[]) {
        int[] mergeUnsortedArray = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergeUnsortedArray[k++] = arr1[i++];
            } else {
                mergeUnsortedArray[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            mergeUnsortedArray[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            mergeUnsortedArray[k++] = arr2[j++];
        }

        Arrays.sort(mergeUnsortedArray);
        return mergeUnsortedArray;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {9, 8, 7};
        int[] mergeSortedArrays = mergeUnsortedArrays(arr1, arr2);

        System.out.println("Array1: " + Arrays.toString(arr1));
        System.out.println("Array2: " + Arrays.toString(arr2));
        System.out.println("MergedArray: " + Arrays.toString(mergeSortedArrays));
    }
}
