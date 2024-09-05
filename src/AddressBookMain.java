import java.util.*;

public class AddressBookMain
{
    public static void main(String[] args) {

        List<AddressBook> contact=new ArrayList<AddressBook>();

        Scanner sc=new Scanner(System.in);

        char userChoice='Y';
        while (userChoice == 'Y') {
            AddressBook a=new AddressBook();
            System.out.println("Enter contact details to add into AddressBook");

            System.out.println("First_Name : ");
            a.setFirstName(sc.next());
            System.out.println("Last_Name");
            a.setLastName(sc.next());
            System.out.println("Address :");
            a.setAddress(sc.next());
            System.out.println("City :");
            a.setCity(sc.next());
            System.out.println("State :");
            a.setState(sc.next());
            System.out.println("ZipCode :");
            a.setZip(sc.nextInt());
            System.out.println("PhoneNumber :");
            a.setPhoneNumber(sc.nextLong());
            System.out.println("Email :");
            a.setEmail(sc.next());

            contact.add(a);
            System.out.println("Entered Contacts are :");
            System.out.println(contact);

            System.out.println("Do you wish to add any contact details : if yes press 'Y' or else 'N' :");
            userChoice = sc.next().charAt(0);
        }

    }
}
