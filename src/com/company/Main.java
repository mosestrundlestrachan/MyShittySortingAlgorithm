package com.company;

public class Main{

    static void swap(int[] ray, int i, int j){

        int current = ray[i];
        ray[i] = ray[j];
        ray[j] = current;
    }

    static int splitting(int[] ray, int low, int high){

        int pivot = ray[high];
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++){

            if (ray[j] < pivot){
                i++;
                swap(ray, i, j);
            }
        }
        swap(ray, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] ray, int low, int high){

        if (low < high){
            int dv = splitting(ray, low, high);
            quickSort(ray, low, dv - 1);
            quickSort(ray, dv + 1, high);
        }
    }

    public static void main(String[] args){
        int[] intArray = new int[]{ 12,1,4,8,3,21,9};
        for (int i : sort(intArray))
        {
            printArray(ray, n);
        }
    }

    public static void printArray(int[] ray, int size) {
        for (int i : ray) {
            System.out.print(ray[i] + " ");
        }
    }

    public static int[] sort(int[] nums){
        return nums;
    }
}
