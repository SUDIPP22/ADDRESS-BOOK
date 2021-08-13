package com.bridgelabz;

public class AddressBookMain {
    /**
     * This main method is used to print welcome message and
     * displaying a person's detail
     * @param args Unused
     */
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Program");

        Contacts contact = new Contacts("Sudip ", "Panja ", "1/A/7 ", "Kolkata ",
                "West Bengal", 700050L, 8910211371L, "panja370@gmail.com ");
        System.out.println("Name : " +contact.getFirstName()+ " " +contact.getLastName());
        System.out.println("Address : " +contact.getAddress());
        System.out.println("City : " +contact.getCity());
        System.out.println("State : " +contact.getState());
        System.out.println("Zip Code : " +contact.getZip());
        System.out.println("Phone Number : " +contact.getPhoneNumber());
        System.out.println("E-Mail Id : " +contact.getEmail());

    }
}





