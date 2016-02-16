package theironyard;

/**
 * Created by Caroline on 2/16/16.
 */
public class Contact {
    String name;
    String phone;
    String email;


    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", name, phone, email);
    }
}




//        Requirements

//        Don't add a new contact if any of the three fields are blank.

//        Optional
//        Save the contacts to a file (either JSON or custom format, your choice) whenever a contact is added or removed.
//        Load that file in the initialize method in Controller.java, parse it, and populate the contacts with it.
