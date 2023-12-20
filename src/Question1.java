import java.lang.reflect.Array;
import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 7, 5, 9};
        String[] arr2 = {"sam", "apple", "dam" };
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       System.out.println(Arrays.toString(arr1));
       System.out.println(Arrays.toString(arr2));

    }
}