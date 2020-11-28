package io.github.arlol.chop;

public class Chop3 implements Chop {

	@Override
	public int chop(int value, int[] values) {
		if (values.length == 0) {
			return -1;
		}
		int start = 0;
		int end = values.length - 1;
		do {
			int middle = (start + end) / 2;
			int middleValue = values[middle];
			if (middleValue == value) {
				return middle;
			} else if (middleValue > value) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
		} while (start <= end);
		return -1;
	}

}
