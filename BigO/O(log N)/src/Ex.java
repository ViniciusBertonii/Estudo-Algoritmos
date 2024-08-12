public class Ex {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int index = binarySearch(array, 3);
        System.out.println(index); // Output: 2
    }
}
