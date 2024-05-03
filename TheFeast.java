package be6_complexity_hw6;

public class TheFeast {

	public static int theFeast(int n, int c, int m) {
		int eat = n / c;
		int wrap = eat;
		while (wrap >= m) {
			eat = eat + (wrap / m);
			wrap = (wrap / m) + (wrap % m);
		}
		return eat;
	}

	public static void main(String[] args) {
		System.out.println(theFeast(15, 3, 2));
	}
}
