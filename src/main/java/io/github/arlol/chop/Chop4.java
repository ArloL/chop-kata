package io.github.arlol.chop;

public class Chop4 implements Chop {

	@Override
	public int chop(int value, int[] values) {
		int end = values.length;
		for (int start = 0; start < end;) {
			int middle = (end + start) / 2;
			if (values[middle] < value) {
				start = middle + 1;
			} else {
				end = middle;
			}
		}
		return end < values.length && values[end] == value ? end : -1;
	}

}
