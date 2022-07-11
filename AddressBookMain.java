package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		Scanner sc =new Scanner(System.in);
		int option;
		while(true) {
			System.out.println("Operation to perform\n 1)Add Contact\n 2)edit contact\n 3)delete\n 4)Display contact\n 5)AddAddressBook\n 6)View by city\n 7)view by state");
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
			case 6:
	        	System.out.println("Enter the city");
	        	String city=sc.next();
	        	ServiceBook.viewCity(city);
	        case 7:
	        	System.out.println("Enter the state");
	        	String State=sc.next();
	        	ServiceBook.viewState(State);
			default:
				System.out.println("Enter the correct option");
			}
			sc.close();
		System.out.println("keep visit website");
		}
	}
}
