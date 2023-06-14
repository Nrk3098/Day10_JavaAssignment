package com.Array1;

public class ReverseArray {
    public static void main(String[] args){
        int arr[]={3,4,6,7,8};
        System.out.println("Array in reverse order: ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+ " ");
        }
    }
}
