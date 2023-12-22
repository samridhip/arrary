import java.lang.reflect.Array;
import java.util.Arrays;

public class Question7 {
    public static void main(String[] args) {
        int[] my_arrays={22,66,49,600};
        System.out.println("original array :"+ Arrays.toString(my_arrays));
        int removeIndex=1;
        for(int i=removeIndex;i< my_arrays.length-1;i++){
            my_arrays[i]=my_arrays[i+1];
        }
        System.out.println("After deletion:"+Arrays.toString(my_arrays));
    }
    }
