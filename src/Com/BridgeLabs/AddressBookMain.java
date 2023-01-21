package Com.BridgeLabs;
import Com.BridgeLabs.AddresBook;
public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddresBook addressBook1 = new AddresBook();
		addressBook1.addContact();
        System.out.println(addressBook1.contact.getFirstName());
        System.out.println(addressBook1.contact.getLastName());
        System.out.println(addressBook1.contact.getPhoneNumber());
        System.out.println(addressBook1.contact.getEmail());
	}

}
