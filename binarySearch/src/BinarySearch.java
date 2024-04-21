public class BinarySearch {
    public static void main(String[] args) {
        int[] myList = new int[128];

        for (int i = 0; i < myList.length; i++) {
            myList[i]=i+1;
        }

        System.out.println(binarySearch(myList, 60));
        System.out.println(binarySearch(myList, 129));
    }

    public static int binarySearch(int[] list, int item) {
        if (isListEmpty(list)) {
            return -1;
        }

        int low = 0;
        int high = list.length - 1;
        int count=0;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];
            count++;

            if (guessEqualsItem(guess, item)) {
                return count;
                
            } else if (guessGreaterThanItem(guess, item)) {
                high = mid - 1;
            } else if(guessLessThanItem(guess, item)) {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static boolean isListEmpty(int[] myList) {
        int listSize = myList.length;
        if (listSize == 0) {
            return true;
        }
        return false;
    }

    public static boolean guessEqualsItem(int guess, int item) {
        if (guess != item) {
            return false;
        }
        return true;
    }

    public static boolean guessGreaterThanItem(int guess, int item) {
        if (guess < item) {
            return false;
        }
        return true;
    }

    public static boolean guessLessThanItem(int guess, int item) {
        if (guess > item) {
            return false;
        }
        return true;
    }
}