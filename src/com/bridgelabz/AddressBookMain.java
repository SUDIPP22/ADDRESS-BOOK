package com.bridgelabz;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Purpose : To Create an Address Book system
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-08-12
 */

public class AddressBookMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        Map<String, AddressBook> addressBookMap = new HashMap<>();

        while (true) {
            System.out.println("\nWelcome to Address Book System");
            System.out.println("1. New Address Book \n2. Select Address Book \n3. Delete Address Book \n4. Search Contact Data \n5. View Contact Person \n6. Exit");
            System.out.print("Enter Your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter Name of new Address Book: ");
                    String bookName = sc.next();
                    sc.nextLine();
                    addressBookMap.put(bookName, new AddressBook());// adding bookName as a key and value is allocating
                    // memory for AddressBook obj
                    AddressBook.addressBookOptions(addressBookMap.get(bookName));// call AddressBookOption method with
                    // passing key of hashmap
                    break;
                case 2:
                    System.out.println("List of available Address Book : ");
                    Set<String> keys = addressBookMap.keySet();// retrieved keys from hashmap to show AddressBookList
                    for (String key : keys) {
                        System.out.println(key);
                    }
                    System.out.println("Enter Address Book name you want to Open : ");
                    String name = sc.nextLine();
                    System.out.println("Current Address Book is : " + name);
                    AddressBook.addressBookOptions(addressBookMap.get(name));// call method with passing address book name
                    break;
                case 3:
                    System.out.println("Enter Address Book name to be delete: ");
                    name = sc.nextLine();
                    addressBookMap.remove(name);// delete hashmap using remove
                    break;
                case 4:
                    System.out.println("Welcome to the search option:");
                    addressBook.searchByOptions();
                case 5:
                    System.out.println("Welcome to view By option:");
                    AddressBook.viewByOption(addressBookMap);
                case 6:
                    sc.close();// for closing the programme
                    return;
                default:
                    System.out.println("You Entered Invalid Choice....!");
                    break;
            }
        }
    }
}
