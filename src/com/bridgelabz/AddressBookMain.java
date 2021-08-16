package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Purpose : To Create an Address Book by
 * using getters & setters
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-08-12
 */

public class AddressBookMain {
    ArrayList<Contacts> contactDetails = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    /**
     * This method is used to add a person's details
     */
    public void addNewDetails() {
        Contacts details = new Contacts();
        System.out.println("Enter First Name :");
        details.setFirstName(sc.nextLine());
        System.out.println("Enter Last Name :");
        details.setLastName(sc.nextLine());
        System.out.println("Enter Address : ");
        details.setAddress(sc.nextLine());
        System.out.println("Enter City : ");
        details.setAddress(sc.nextLine());
        System.out.println("Enter State : ");
        details.setState(sc.nextLine());
        System.out.println("Enter E-Mail Id : ");
        details.setEmail(sc.nextLine());
        System.out.println("Enter Zip Code : ");
        details.setZip(sc.nextLong());
        System.out.println("Enter Phone Number : ");
        details.setPhoneNumber(sc.nextLong());

        contactDetails.add(details);
        sc.close();
    }

    /**
     * This method is used to display the added person's details
     */
    public void display() {
        System.out.println(contactDetails);
    }
    /**
     * This is the main method which make use of addNewDetails and
     * display method.
     * @param args Unused
     */
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Program");
        AddressBookMain contactInfo = new AddressBookMain();
        contactInfo.addNewDetails();
        contactInfo.display();
    }
}





