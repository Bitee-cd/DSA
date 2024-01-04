package sort;

public class ShuffleSort {
    public static void Shuffle(Object[] a){
        int N = a.length;
        for(int i=0; i<N;i++){
            int r =stdRandom.uniform(i+1);
            exchange(a,i,r);
        }
    }

    private static void exchange(Object[] a, int i, int r) {
    }
}
