package Data.repositories;

import Data.models.Phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhonebookRepositoryImpl implements PhonebookRepository{


    private List<Phonebook> phonebooks = new ArrayList<>();

    @Override
    public Phonebook findById(String phonebook) {
        for (Phonebook phonebook1: phonebooks){
            if (phonebook1.getOwnersNumber().equals(phonebook)){
                return phonebook1;
            }
        }
        return null;
    }

    @Override
    public Phonebook save(Phonebook phonebook) {
        Phonebook savedPhonebook = findById(phonebook.getOwnersNumber());
        if (savedPhonebook == null)phonebooks.add(phonebook);
        else{
            updateSavedPhonebook(phonebook, savedPhonebook);
        }return phonebook;
    }

    private void updateSavedPhonebook(Phonebook phonebook, Phonebook savedPhonebook){
        savedPhonebook.setOwnersName(phonebook.getOwnersName());
        savedPhonebook.setContacts(phonebook.getContacts());
        savedPhonebook.setOwnersNumber(phonebook.getOwnersNumber());
    }

    @Override
    public void delete(Phonebook phonebook) {
    }

    @Override
    public int count() {
        return phonebooks.size();
    }
}
