package Data.repositories;

import Data.models.Phonebook;

public interface PhonebookRepository{

    Phonebook findById(String phonebook);

    Phonebook save(Phonebook phonebook);

    void delete(Phonebook phonebook);

    int count();
}
