package com.hanbit.no.standalone;

public class God {

	private static God god;

	private God() {

	}

	public static God pray() {
		if (god == null) {
			god = new God();
		}

		return god;
	}

}
