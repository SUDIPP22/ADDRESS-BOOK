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
    static Scanner sc = new Scanner(System.in);

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

    /**
     * This is the main method which make use of addNewDetails method,
     * editDetails method and
     * deleteDetails method
     * @param args Unused
     */
    public static void main(String[] args) {
        AddressBookMain contactInfo = new AddressBookMain();
        contactInfo.addNewDetails();
        int i = 0;
        while (i == 0) {
            System.out.println("Welcome To Address Book Program");
            System.out.println("Choose an option : ");
            System.out.println("1.Add details\n2.Edit Details\n3.Delete Details");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    contactInfo.addNewDetails();
                    break;
                case 2:
                    contactInfo.editDetails();
                    break;
                case 3:
                    contactInfo.deleteDetails();
                    break;
                default:
                    i = 1;
                    System.out.println("Wrong option");
                    break;
            }
        }
    }
}




