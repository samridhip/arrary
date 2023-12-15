import java.lang.reflect.Array;
import java.util.Arrays;

public class Question1 {
    public static void main(String[]args){
        int[] array_1={44,88,58,95,03,18};
        String[] array_2= {"java","samr","house","boy","video" };
        System.out.println("Original integer "+Arrays.toString(array_1));
        System.out.println("Original String "+Arrays.toString(array_2));
        Arrays.sort(array_1);
        System.out.println("Sorted integer "+ Arrays.toString(array_1));
        Arrays.sort(array_2);
        System.out.println("Sorted String "+Arrays.toString(array_2));

    }
}
