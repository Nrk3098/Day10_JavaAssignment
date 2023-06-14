package com.Array1;

public class EvenPosition {
    public static void main(String[]args){
        int arr[]={5,2,8,9,7,1};
        System.out.print("Element of an array present on the even position are: ");
        for(int i=1;i<arr.length;i=i+2){
            System.out.print(arr[i]+ " " );
        }
    }
}
