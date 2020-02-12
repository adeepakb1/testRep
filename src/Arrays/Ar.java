package Arrays;

import Chess.Board;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Ar {

    public  static int[] rotateRight(int [] arr, int noOfRotations) {
        int [] temp = new int[noOfRotations];
        for (int i = 0 ;i<arr.length;i++){
            if(i<noOfRotations){
                temp[i]=arr[i];
                arr[i]=arr[i+noOfRotations];
            } else if(i<arr.length-noOfRotations){
                arr[i]=arr[i+noOfRotations];
            }else {
                arr[i]=temp[-(arr.length-noOfRotations-i)];
            }

        }
        return arr;
    }


    public static int[] roatateWithReversalMethod(int [] arr, int noOfRotations){
        reverseArray(arr,0,noOfRotations-1);
        reverseArray(arr,noOfRotations,arr.length-1);
        reverseArray(arr,0,arr.length-1);
        return arr;

    }

    private static void reverseArray(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static  void cyclicRotation(int [] arr){




        int temp = arr[arr.length-1];
        for(int i = 1 ; i < arr.length;i++){
            arr[arr.length-i]=arr[arr.length-i-1];
        }
        arr[0]=temp;

    }

    public static void sortWithoutNegative(int [] arr){
        int temp = arr[arr.length-1];
        Vector<Integer> ans =  new Vector<>();
        for (int i =0 ; i<arr.length;i++){
            if(arr[i]>0){
                ans.add(arr[i]);
            }
        }
        Collections.sort(ans);
        int j = 0;
        for (int i = 0; i <arr.length ; i++)
        {
            if (arr[i] >= 0)
        {
            arr[i] = ans.get(j);
            j++;
        }
        }

        arr[0]=temp;
    }
}
