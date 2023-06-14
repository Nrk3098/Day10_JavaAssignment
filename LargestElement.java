package com.Array1;

public class LargestElement {
    public static void main(String[]args){
        int arr[]={8,9,0,3,4,7,1};
        int large = arr[0];
        for(int i=0;i<arr.length;i++){
            if(large<arr[i]){
                large=arr[i];
            }
        }
        System.out.print("Largest number is: " +large);
    }

}
