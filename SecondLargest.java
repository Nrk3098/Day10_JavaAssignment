package com.Array1;

public class SecondLargest {
    public static void main(String[] args){
        int arr[]={3,8,9,0,2,1};
        int temp=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
            System.out.print("Second largest number in array is: " +arr[arr.length-2]);
        }
    }

