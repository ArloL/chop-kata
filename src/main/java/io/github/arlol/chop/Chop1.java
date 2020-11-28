package io.github.arlol.chop;

import java.util.Arrays;

public class Chop1 implements Chop {

	@Override
	public int chop(int value, int[] values) {
		if (values.length == 0) {
			return -1;
		} else if (values.length == 1) {
			return values[0] == value ? 0 : -1;
		}
		int middle = Math.abs(values.length / 2);
		if (values[middle] > value) {
			return chop(value, Arrays.copyOfRange(values, 0, middle));
		}
		int chop = chop(value,
				Arrays.copyOfRange(values, middle, values.length));
		return chop == -1 ? -1 : middle + chop;
	}

}
