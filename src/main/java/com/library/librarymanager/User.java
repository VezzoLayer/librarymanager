package com.library.librarymanager;

public class User {

	private int id;
	private double balance;
	private static int lastId = 0;

	public User() {
		this.id = ++lastId;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	public void deposit(double amount) {
		// TODO Auto-generated method stub
		if (amount < 0) {
			throw new IllegalArgumentException("Negative amount: " + amount);
		}
		balance += amount;
	}
}
