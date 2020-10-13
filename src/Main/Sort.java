package Main;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort {
	private Object[] array;

	public void sort(int[] a) {
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
