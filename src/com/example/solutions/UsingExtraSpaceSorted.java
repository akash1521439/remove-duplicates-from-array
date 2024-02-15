package com.example.solutions;

public class UsingExtraSpaceSorted {
    public static int[] removeDuplicate(int[] arr){
        int length = arr.length;
        int[] tempArr = new int[length];
        int counter = 0;
        int k =0;
        for (int i = 0; i<length-1;i++){
                if(arr[i] != arr[i+1]){
                    tempArr[k++] = arr[i];
                } else {
                    counter++;
                }
        }
        tempArr[k++] = arr[length - 1];
        int[] finalArr = new int[length-counter];
        for(int i=0,j=0;i<length;i++){
            if(tempArr[i]>0){
                finalArr[j++] = tempArr[i];
            }
        }
        return finalArr;
    }
    public static void main(String[] args){
        int[]  arr = { 1, 1, 2, 2, 2, 3, 3, 4 , 5, 6, 6 };
        for(int i:UsingExtraSpaceSorted.removeDuplicate(arr)){
            System.out.print(i+" ");
        }
    }
}
