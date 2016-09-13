package com.hanbit.no.standalone;

import static org.hamcrest.CoreMatchers.instanceOf;

public class Location {
	public static final String HOSPITAL = "병원";
	public static final String HOME = "�?";
	public static final String SCHOOL = "?���?";

	public static Location LOC_HOME = new Location(HOME, "?��?�� 강서�?");
	public static Location LOC_HOSPITAL = new Location(HOSPITAL, "?��?�� 마포�?");
	public static Location LOC_SCHOOL = new School("?��?�� ???���?");

	private String name;
	private String address;

	private boolean opened;
	private boolean toilet;

	private int rooms;

	public Location(String name, String address) {
		this.name = name;
		this.address = address;

		Location school = new School("?��?��");

		if (school instanceof School) {
			School middleSchool = (School) school;
		}
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String toString() {
		return name;
	}

	public int getRooms() {
		return rooms;
	}

	public boolean isOpened() {
		return opened;
	}

	public boolean hasToilet() {
		return toilet;
	}

}
