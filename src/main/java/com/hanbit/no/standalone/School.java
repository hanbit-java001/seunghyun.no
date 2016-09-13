package com.hanbit.no.standalone;

public class School extends Location {

	private int classrooms;

	public School(String address) {
		super(Location.SCHOOL, address);
	}

	public int getClassrooms() {
		return classrooms;
	}

}
