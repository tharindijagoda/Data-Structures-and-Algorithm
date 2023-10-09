
public class ArrayReverse {
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void display(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = new int[]{10,20,30,40,50,60,70,80};
        display(arr);
        reverse(arr,0,arr.length-1);
        display(arr);
    }
}
