package ContactService;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    @Test
    void testValidContactCreation() {
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Street");
        assertEquals("John", contact.getFirstName());
    }

    @Test
    void testInvalidPhoneThrowsException() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("12345", "John", "Doe", "123", "123 Street"));
    }
}
