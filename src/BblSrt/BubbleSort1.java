package BblSrt;
//stable unstable

import java.util.Arrays;

public class BubbleSort1 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubblesort(int[] arr) {
        boolean isSwapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSwapped = true;
                }
                if(!isSwapped){
                    break;
                }
            }
        }
    }
}
