
//Sorting of an array using selection sort

package com.Arrays2;
import java.util.*;
public class SelectionSort {
    public static int[] selectionSort(int arr[]) {
        int n = arr.length, temp;
        for (int i = 0; i < n; ++i) {
            for (int j = i; j < n; ++j) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Unsorted Array");
        System.out.print("{ ");
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("}");

        selectionSort(arr);
        System.out.println("Sorted Array");
        System.out.print("{ ");
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("}");
    }
}
