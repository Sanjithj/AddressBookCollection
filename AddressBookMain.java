package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		Scanner sc =new Scanner(System.in);
		int option;
		while(true) {
			System.out.println("Operation to perform\n 1)Add Contact\n 2)edit contact\n 3)delete\n4)Display contact\n5)AddAddressBook");
			option =sc.nextInt();
			switch(option) {
			case 1:
				ServiceBook.addContact();
				break;
			case 2:
				ServiceBook.editContact();
				break;
			case 3:
				ServiceBook.deleteContact();
				break;
			case 4:
				ServiceBook.display();
				break;
			case 5:
				ServiceBook.addAddressBook();
			default:
				System.out.println("Enter the correct option");
			}
			sc.close();
		System.out.println("keep visit website");
		}
	}
}
