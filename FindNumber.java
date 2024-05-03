package be6_complexity_hw6;

import java.util.Arrays;

public class FindNumber {

	public static int findNumber(int num, int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 11, 13, 2, 5, 44, 56, 100, 92 };
		System.out.println(findNumber(11, arr));
	}
}
