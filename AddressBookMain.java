package com.bridgelabz;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		ServiceBook.addContact();
		ServiceBook.display();
	}
}
