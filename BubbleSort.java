import java.util.*;
public class Bubble {
    public static void main(String[] args) {
        int [] arr ={0,8,9,67,-1,-76};
        long starttime = System.nanoTime();
        System.out.println("After Sorted:");
        BubbleSort(arr);
        long endtime = System.nanoTime();
        double timeInSec = (endtime - starttime)/1e9;
        System.out.println(Arrays.toString(arr));
        System.out.println("Time Taken: " +timeInSec +" Seconds");
    }
    static void BubbleSort(int [] arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped = false;
            for(int j=1;j<arr.length -i;j++){
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
            break;
        }
        }
    }
}
