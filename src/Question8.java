import java.util.Arrays;

public class Question8 {
    public static void main(String[] args) {
   int[] my_array={44,37,84,29,100,60,588,88,49,38};
    int[] array=new int[10];
    System.out.println("Original array is:"+ Arrays.toString(my_array));
    for(int i=0;i< my_array.length;i++){
        array[i]=my_array[i];
    }
    System.out.println("New array:"+Arrays.toString(array));

    }
}