package io.github.arlol.chop;

public class Chop5 implements Chop {

	@Override
	public int chop(int value, int[] values) {
		int middle = values.length / 2;
		for (int count = 1; count <= (int) Math
				.ceil(Math.sqrt(values.length)); count++) {
			int valueMiddle = values[middle];
			if (valueMiddle == value) {
				return middle;
			} else if (valueMiddle > value) {
				middle = middle / 2;
			} else {
				middle = middle + values.length / (int) Math.pow(2, count);
			}
			if (middle >= values.length) {
				middle = values.length - 1;
			}
		}
		return middle < values.length && values[middle] == value ? middle : -1;
	}

}
