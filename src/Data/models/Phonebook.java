package Data.models;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {


    private String ownersName;
    private String ownersNumber;
    private List <Contact> contacts = new ArrayList<>();

    public String getOwnersName() {
        return ownersName;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }

    public String getOwnersNumber() {
        return ownersNumber;
    }

    public void setOwnersNumber(String phoneNumber) {
        this.ownersNumber = phoneNumber;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
