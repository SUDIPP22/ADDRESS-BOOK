package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
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
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, ArrayList<Contacts>> hashMap = new HashMap<>();
    static AddressBookMain details = new AddressBookMain();

    /**
     * This method is used to add a person's details
     */
    public void addNewDetails() {
        Contacts details = new Contacts();
        System.out.println("Enter First Name :");
        details.setFirstName(sc.next());
        System.out.println("Enter Last Name :");
        details.setLastName(sc.next());
        System.out.println("Enter Address : ");
        details.setAddress(sc.next());
        System.out.println("Enter City : ");
        details.setCity(sc.next());
        System.out.println("Enter State : ");
        details.setState(sc.next());
        System.out.println("Enter E-Mail Id : ");
        details.setEmail(sc.next());
        System.out.println("Enter Zip Code : ");
        details.setZip(sc.nextLong());
        System.out.println("Enter Phone Number : ");
        details.setPhoneNumber(sc.nextLong());

        contactDetails.add(details);
    }

    /**
     * This method is used to display the details
     */
    public void display() {
        System.out.println(contactDetails);
    }

    /**
     * This method is used to edit the existing person's details
     */
    public void editDetails() {
        System.out.println("Confirm Your First Name to Edit Details : ");
        String confirmFirstName = sc.next();
        for (int index = 0; index < contactDetails.size(); index++) {
            if (contactDetails.get(index).getFirstName().equals(confirmFirstName)) {
                System.out.println("Select options from below to change : ");
                System.out.println("\n1.First Name : \n2.Second Name : \n3.Address : \n4.City : \n5.State: \n6.Zip Code : " +
                        "\n7.Phone Number : \n8.Email Id :");
                int edit = sc.nextInt();

                switch (edit) {
                    case 1:
                        System.out.println("Enter First Name : ");
                        contactDetails.get(index).setFirstName(sc.next());
                        break;
                    case 2:
                        System.out.println("Enter Last Name : ");
                        contactDetails.get(index).setLastName(sc.next());
                        break;
                    case 3:
                        System.out.println("Enter Address : ");
                        contactDetails.get(index).setAddress(sc.next());
                        break;
                    case 4:
                        System.out.println("Enter City : ");
                        contactDetails.get(index).setCity(sc.next());
                        break;
                    case 5:
                        System.out.println("Enter State : ");
                        contactDetails.get(index).setState(sc.next());
                        break;
                    case 6:
                        System.out.println("Enter Zip Code : ");
                        contactDetails.get(index).setZip(sc.nextLong());
                        break;
                    case 7:
                        System.out.println("Enter Phone Number : ");
                        contactDetails.get(index).setPhoneNumber(sc.nextLong());
                        break;
                    case 8:
                        System.out.println("Enter E-Mail Id : ");
                        contactDetails.get(index).setEmail(sc.next());
                        break;
                }
                System.out.println("Edited List is :");
                System.out.println(contactDetails);
            } else
                System.out.println("Enter valid First name ");
        }
    }

    /**
     * This method is used to delete the existing person's details
     */
    public void deleteDetails() {
        System.out.println("Confirm Your First Name to Delete Details ");
        String confirmFirstName = sc.next();
        for (int index = 0; index < contactDetails.size(); index++) {
            if (contactDetails.get(index).getFirstName().equals(confirmFirstName)) {
                contactDetails.remove(index);
                System.out.println("After Removing The List is :" + contactDetails);
            } else
                System.out.println("Enter valid First name ");
        }
    }

    public void createAddressBook() {
        while (true) {
            System.out.println("Choose what you want to do : ");
            System.out.println("1.Create new address book.\n2.Edit existing address book.\n3.Display all address books.\n4.Exit");
            int choose = sc.nextInt();

            if (choose == 4) {
                System.out.println("Exited");
                break;
            }
            switch (choose) {
                case 1:
                    System.out.println("Enter the name of the address book : ");
                    String addressName = sc.next();

                    // condition for checking uniqueness of address book
                    if (hashMap.containsKey(addressName)) {
                        System.out.println("Address book name exist, enter a different name ");
                        break;
                    }
                    contactDetails = new ArrayList<>();
                    while (true) {
                        System.out.println("Choose an option : ");
                        System.out.println("1.Add details\n2.Edit Details\n3.Delete Details\n4.Display Contact Details\n5.Exit");
                        int choose1 = sc.nextInt();
                        if (choose1 == 5) {
                            System.out.println("Address book name exist, enter different name");
                            break;
                        }
                        switch (choose1) {
                            case 1:
                                details.addNewDetails();
                                break;
                            case 2:
                                details.editDetails();
                                break;
                            case 3:
                                details.deleteDetails();
                                break;
                            case 4:
                                details.display();
                                break;
                            default:
                                System.out.println("Wrong option");
                                break;
                        }
                        hashMap.put(addressName, contactDetails);
                        System.out.println(hashMap);
                    }
                    break;
                case 2:
                    System.out.println("Enter the name of address book : ");
                    String addressOldName = sc.next();

                    // conditions for checking whether the address book exists or not.
                    if (hashMap.containsKey(addressOldName)) {
                        contactDetails = new ArrayList<>();
                        contactDetails = hashMap.get(addressOldName);
                        while (true) {
                            System.out.println("Choose an option : ");
                            System.out.println("1.Add details\n2.Edit Details\n3.Delete Details\n4.Display Contact Details\n5.Exit");
                            int choose1 = sc.nextInt();
                            if (choose1 == 5) {
                                System.out.println("Exited");
                                break;
                            }
                            switch (choose1) {
                                case 1:
                                    details.addNewDetails();
                                    break;
                                case 2:
                                    details.editDetails();
                                    break;
                                case 3:
                                    details.deleteDetails();
                                    break;
                                case 4:
                                    details.display();
                                    break;
                                default:
                                    System.out.println("Wrong option");
                                    break;
                            }
                            hashMap.put(addressOldName, contactDetails);
                            System.out.println(hashMap);
                        }
                    } else {
                        System.out.println("Enter valid address book name");
                    }
                    break;
                case 3:
                    System.out.println(hashMap);
                    break;
                default:
                    System.out.println("Enter valid option");
            }
        }
    }

    /**
     * This is the main method which make use of createAddressBook method
     * @param args Unused
     */
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Program");
        details.createAddressBook();
    }
}




