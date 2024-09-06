import java.util.*;

public class AddressBookMain
{
    public static void main(String[] args)
    {

        System.out.println("Welcome to Address Book Program!!");

        System.out.println("===================================");

        List<AddressBook> contact = new ArrayList<AddressBook>();

        Scanner sc = new Scanner(System.in);

        String userChoice = "Yes";

        while (userChoice.equalsIgnoreCase("yes"))
        {
            AddressBook a = new AddressBook();
            System.out.println("Enter contact details to add into AddressBook");

            System.out.println("First_Name : ");
            a.setFirstName(sc.next().toUpperCase());
            System.out.println("Last_Name");
            a.setLastName(sc.next().toUpperCase());
            System.out.println("Address :");
            a.setAddress(sc.next().toUpperCase());
            System.out.println("City :");
            a.setCity(sc.next().toUpperCase());
            System.out.println("State :");
            a.setState(sc.next().toUpperCase());
            System.out.println("ZipCode :");
            a.setZip(sc.nextInt());
            System.out.println("PhoneNumber :");
            a.setPhoneNumber(sc.nextLong());
            System.out.println("Email :");
            a.setEmail(sc.next());

            contact.add(a);
            System.out.println("Entered Contacts are :");
            System.out.println(contact);

            System.out.println("Do you have more contacts to add ?: if yes press Yes or else No :");
            userChoice = sc.next();
        }

        System.out.println("Do you wish to edit any contact's name ?: if yes press Yes or else No :");
        String editChoice = sc.next();
        while (editChoice.equalsIgnoreCase("Yes"))
        {
            System.out.println("Enter the user last name ");
            String s = sc.next();

            for (AddressBook i : contact)
            {
                if (s.equalsIgnoreCase(i.getLastName()))
                {
                    System.out.println("Enter the new name :");
                    i.setLastName(sc.next().toUpperCase());
                    System.out.println(contact);
                }
            }
            System.out.println("Do you wish to edit any contact's name ?: if yes press Yes or else No :");
            editChoice = sc.next();
        }


        System.out.println("Do you wish to delete any contact ?: if yes press Yes or else No :");
        String deleteChoice = sc.next();
        while (deleteChoice.equalsIgnoreCase("Yes"))
        {
            System.out.println("Enter the user last name ");
            String s = sc.next();

            for (AddressBook i : contact)
            {
                if (s.equalsIgnoreCase(i.getLastName()))
                {
                    contact.remove(i);
                    System.out.println(i.getLastName()+" contact deleted Successfully!!");
                    System.out.println(contact);
                    break;
                }
            }
            if(contact.isEmpty())
            {
                System.out.println("Address Book is Empty");
                break;
            }

            System.out.println("Do you wish to delete contact ?: if yes press Yes or else NO :");
            deleteChoice = sc.next();
        }
    }
}





