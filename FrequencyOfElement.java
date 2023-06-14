package com.Array1;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 3, 5, 1};
        int frequency,visited;
        // Count the frequencies using a nested loop
        for (int i = 0; i < arr.length; i++) {
           frequency = 1;
           visited=0;

            for (int j = 0; j < arr.length; j++) {
                if (j>=i) {
                    if(arr[i]==arr[j] && i!=j){
                        frequency++;
                    }

                }
                else if(arr[i]==arr[j]){
                    visited=1;
                }
            }
            if(visited!=1) {
                System.out.println("Frequency of element "+arr[i]+" is "+frequency+" times");
            }

        }

    }

}
