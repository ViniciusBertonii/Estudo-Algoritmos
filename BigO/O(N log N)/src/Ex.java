public class Ex {
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        
        int mid = arr.length / 2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[arr.length - mid];

        System.arraycopy(arr, 0, leftHalf, 0, mid);
        System.arraycopy(arr, mid, rightHalf, 0, arr.length - mid);

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(arr, leftHalf, rightHalf);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        mergeSort(array);
        for (int num : array) {
            System.out.print(num + " "); // Output: 1 2 5 5 6 9
        }
    }
}
