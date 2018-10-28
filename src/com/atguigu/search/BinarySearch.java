package com.atguigu.search;

public class BinarySearch {

	public static int commonBinarySearch(int[] arr, int key) {

		int high = arr.length - 1;
		int low = 0;
		int mid = 0;

		while (low <= high) {

			mid = (low + high) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] > key) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static int recursionBinarySearch(int[] arr, int key, int low, int high) {
		if (low > high) {
			return -1;
		}
		int middle = (low + high) / 2;
		if (arr[middle] > key) {
			return recursionBinarySearch(arr, key, low, middle - 1);
		} else if (arr[middle] < key) {
			return recursionBinarySearch(arr, key, middle + 1, high);
		} else {
			return middle;
		}
	}

}
