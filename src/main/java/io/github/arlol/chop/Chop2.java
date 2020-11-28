package io.github.arlol.chop;

public class Chop2 implements Chop {

	@Override
	public int chop(int search, int[] values) {
		return chop(search, values, 0, values.length);
	}

	private int chop(int value, int[] values, int start, int end) {
		if (end == 0) {
			return -1;
		}
		if (end - start == 1) {
			if (values[start] == value) {
				return start;
			} else {
				return -1;
			}
		}
		int middle = (start + end) / 2;
		if (values[middle] > value) {
			return chop(value, values, start, middle);
		} else {
			return chop(value, values, middle, end);
		}
	}

}
