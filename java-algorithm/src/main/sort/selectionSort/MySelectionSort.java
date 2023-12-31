package main.sort.selectionSort;

public class MySelectionSort {

    public static void selectionSort(int[] a) {
        selectionSort(a, a.length);
    }

    private static void selectionSort(int[] a, int size) {

        for(int i = 0; i < size - 1; i++) {
            int min_index = i;

            for(int j = i + 1; j < size; j++) {
                if(a[j] < a[min_index]) {
                    min_index = j;
                }
            }

            swap(a, min_index, i);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
