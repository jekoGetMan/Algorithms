import java.util.Arrays;

public class mergeSortedArrays {

    public static int[] mergeSortedArrays(int[] arr1, int arr2[]) {
        int[] mergeSortedArray = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergeSortedArray[k++] = arr1[i++];
            } else {
                mergeSortedArray[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            mergeSortedArray[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            mergeSortedArray[k++] = arr2[j++];
        }

        Arrays.sort(mergeSortedArray);
        return mergeSortedArray;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {9, 8, 7};
        int[] mergeSortedArrays = mergeSortedArrays(arr1, arr2);

        System.out.println("Array1: " + Arrays.toString(arr1));
        System.out.println("Array2: " + Arrays.toString(arr2));
        System.out.println("MergedArray: " + Arrays.toString(mergeSortedArrays));
    }
}
