package com.green.biz;

public class CalcUtil {
	public static int searchMax (int arr[]) {
		int max=arr[0];
		for (int i=1; i<arr.length; i++) {
		if (max<arr[i])
		max = arr[i];
		}
		return max;
	}
}
