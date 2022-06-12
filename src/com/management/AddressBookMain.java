package com.management;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("welcome to the address book management");
		Scanner sc =new Scanner(System.in);
		int option;
		do {
			System.out.println("what operation you want perform\n 1)Add Contact\n 2)edit contact\n 3)delete\n4)Display contact");
			option =sc.nextInt();
			switch(option) {
			case 1:
				AddressBookService.addcontact();
				AddressBookService.display();
				break;
			case 2:
				AddressBookService.edit_contact();
				AddressBookService.display();
				break;
			case 3:
				AddressBookService.delete();
				break;
			case 4:
				AddressBookService.display();
				break;
			default:
				System.out.println("please enter the correct option");
			}
			}while(option !=0);
		System.out.println("please keep visiting my website");
		}
}