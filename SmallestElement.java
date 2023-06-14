package com.Array1;

public class SmallestElement {
    public static void main(String[]args){
        int arr[]={8,9,0,3,4,7,1};
        int small = arr[0];
        for(int i=0;i<arr.length;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        System.out.print("Smallest number is: " +small);
    }
}
