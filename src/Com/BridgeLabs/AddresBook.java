package Com.BridgeLabs;

import java.util.Scanner;

public class AddresBook {
	Contact contact = new Contact();

    void addContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter firstName");
        String firstName = scanner.next();
        System.out.println("Enter lastName");
        String lastName = scanner.next();
        System.out.println("Enter address");
        String address = scanner.next();
        System.out.println("Enter teh zip/pin code");
        int zip=scanner.nextInt();
        System.out.println("Enter email");
        String email = scanner.next();
        System.out.println("Enter Phone number");
        String phoneNumber = scanner.next();
        contact.setPhoneNumber(phoneNumber);
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setEmail(email);
        contact.setAddress(address);
        contact.setZip(zip);
        

}
}
