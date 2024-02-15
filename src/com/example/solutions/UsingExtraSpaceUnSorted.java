package com.example.solutions;
//Remove Duplicate Elements From the unordered Array using extra space
public class UsingExtraSpaceUnSorted {
    public static int[] removeDuplicate(int[] arr){
        int length = arr.length;
        int counter = -1;
        for (int i = 0; i<length;i++){
            for (int j =i+1;j<length;j++){
                if(arr[i] == arr[j]){
                    arr[j] = -1;
                    counter++;
                }
            }
        }
        int[] tempArr = new int[length-counter];
        for(int i=0,j=0;i<length;i++){
            if(arr[i]>=0){
                tempArr[j++] = arr[i];
            }
        }
        return tempArr;
    }
    public static void main(String[] args){
        int[]  arr = {2,4,3,6,2,6,9,12,12};
        for(int i:UsingExtraSpaceUnSorted.removeDuplicate(arr)){
            System.out.print(i+" ");
        }
    }
}
