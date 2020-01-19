import java.util.Arrays;

public class BubbleSortExp {
    public static void main(String[] args) {
        int a[] = {-2,1,19,0,-3,7,12,-9,34,14,2,7,3};
        int sortA[];
        BubbleSort b = new BubbleSort(a);
        sortA = b.Sort();
        System.out.println("SortedA is "+ Arrays.toString(sortA));

    }
}
