package com.library.librarymanager;

public class User {

	private int id;
	private static int lastId = 0;

	public User() {
		this.id = ++lastId;
	}

	public int getId() {
		return id;
	}

}
