public class Question6 {
    public static void main(String[] args) {
        int[] arr={1,7,4,99,40};
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==99){
                index=i;
            }
        }
        System.out.println(index);
    }
}