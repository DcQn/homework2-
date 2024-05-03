package be6_complexity_hw6;

public class MinimumGap {

	public static int minimumDistance(int[] a) {
		int minDistance = Integer.MAX_VALUE;
		int currentDistance = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] == a[j])) {
					currentDistance = Math.abs(i - j);
					minDistance = Math.min(currentDistance, minDistance);
				}
			}
		}
		return minDistance;
	}

	public static void main(String[] args) {
		int[] a = { 1, 1, 7, 4, 2, 7 };
		System.out.println(minimumDistance(a));
	}
}
