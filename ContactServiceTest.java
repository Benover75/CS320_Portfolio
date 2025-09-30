package ContactService;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {

    @Test
    void testAddAndDeleteContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("123", "Jane", "Smith", "1112223333", "Some Address");
        service.addContact(contact);

        assertThrows(IllegalArgumentException.class, () -> service.addContact(contact));
        service.deleteContact("123");
        assertThrows(IllegalArgumentException.class, () -> service.deleteContact("123"));
    }

    @Test
    void testUpdateFields() {
        ContactService service = new ContactService();
        Contact contact = new Contact("321", "Tom", "White", "2223334444", "Old Address");
        service.addContact(contact);

        service.updateFirstName("321", "Tim");
        assertEquals("Tim", contact.getFirstName());
    }
}
