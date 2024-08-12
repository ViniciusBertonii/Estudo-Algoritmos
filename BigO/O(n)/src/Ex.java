public class Ex {
    public static void printElements(int[] arr) {
        for (int element : arr) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        printElements(array);
    }
}
