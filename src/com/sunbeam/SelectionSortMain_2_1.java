package com.sunbeam;

import java.util.Arrays;

public class SelectionSortMain_2_1 {
	
	public static void selectionSort(int arr[], int N) {
		int count = 0;
		for (int i=0;i <= N-1;i++) {
			for(int j = i+1 ;  j < N; j++) {
				count ++;
				
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(" no of comparision=" + count);
	}

	public static void main(String[] args) {
		int arr[] = {4,6,3,7,2};
		
		System.out.println("Array before sort :" + Arrays.toString(arr));
		selectionSort(arr,arr.length);
		System.out.println("Array after sort :" + Arrays.toString(arr));
	

	}

}
