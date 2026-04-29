public class BinarySearch {
    public static int iterative(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (array[middle] == target) {
                return middle;
            } else if (array[middle] < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return -1;
    }

    public static int recursive(int[] array, int target) {
        return recursiveHelper(array, target, 0, array.length - 1);
    }

    private static int recursiveHelper(int[] array, int target, int low, int high) {
        if (low > high) {
            return -1;
        }

        int middle = low + (high - low) / 2;

        if (array[middle] == target) {
            return middle;
        } else if (array[middle] < target) {
            return recursiveHelper(array, target, middle + 1, high);
        } else {
            return recursiveHelper(array, target, low, middle - 1);
        }
    }

    public static int[] buildSortedArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }
}
