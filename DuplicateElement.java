package com.Array1;

public class DuplicateElement {
    public static void main(String[] args){
        int arr[]={1,2,8,2,9,5,3,0,1};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate elements of an array : " +arr[i]);
                }
            }
        }
    }
}
