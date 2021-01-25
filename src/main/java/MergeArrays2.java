public class MergeArrays2 {

    public static int[] mergeArray(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];

        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[count] = arr1[i];
            count++;
        }

        for (int j = 0; j < arr2.length; j++) {
            mergedArray[count] = arr2[j];
            count++;
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {9, 8, 7};
        int[] mergedArray = mergeArray(arr1, arr2);

        for (int count : mergedArray) {
            System.out.println(count);
        }
    }
}