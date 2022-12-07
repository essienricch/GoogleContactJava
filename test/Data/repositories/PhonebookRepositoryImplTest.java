package Data.repositories;

import Data.models.Phonebook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PhonebookRepositoryImplTest {

    PhonebookRepository phonebookRepository;

    @BeforeEach
    void setUp(){
        phonebookRepository = new PhonebookRepositoryImpl();
    }

    @Test
    void savePhoneBookTotalPhonebookIsOneTest(){
        Phonebook richie = new Phonebook();
        phonebookRepository.save(richie);
        assertEquals(1, phonebookRepository.count());
    }

    @Test
    void savePhoneBookFindByIdReturnSavedPhonebook(){
        Phonebook richie = new Phonebook();
        richie.setOwnersNumber("777");
        richie.setOwnersName("Big 7");
        phonebookRepository.save(richie);
        Phonebook savedPhonebok = phonebookRepository.findById("777");
        assertEquals(richie, savedPhonebok);
    }

    @Test
    void updatePhoneBookFindByIdReturnUpdatedPhonebook(){
        Phonebook richie = new Phonebook();
        richie.setOwnersNumber("777");
        richie.setOwnersName("Big 7");
        phonebookRepository.save(richie);

        Phonebook updatedPhonebook = new Phonebook();
        updatedPhonebook.setOwnersNumber("777");
        updatedPhonebook.setOwnersName("Nbm");
        phonebookRepository.save(updatedPhonebook);

        Phonebook savedPhonebook = phonebookRepository.findById("777");
        assertEquals(1, phonebookRepository.count());
        assertEquals("Nbm", savedPhonebook.getOwnersName());
    }

}