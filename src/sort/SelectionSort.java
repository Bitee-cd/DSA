package sort;

public class SelectionSort {

    public static void Sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                    exch(a, i, min);
                }
            }
        }
    }

    private static void exch(Comparable[] a, int i, int min) {
    }

    private static boolean less(Comparable v, Comparable w) {
        return false;
    }
}
