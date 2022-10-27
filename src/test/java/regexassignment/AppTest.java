package regexassignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    void testIsValidName_ValidName() {
        String validName = "Mr. Dylan G Hammonds";
        assertEquals(true, App.RegexUtility.isValidHumanName(validName));
        String validName2 = "Mr. Dylan Gray Hammonds";
        assertEquals(true, App.RegexUtility.isValidHumanName(validName2));
        String validName3 = "Ms. Kaitlyn Elizabeth Morris";
        assertEquals(true, App.RegexUtility.isValidHumanName(validName3));
    }

    @Test
    void testIsInvalidName_InvalidName() {
        String invalidName = "Dylan Hammonds";
        assertEquals(false, App.RegexUtility.isValidHumanName(invalidName));
        String invalidName2 = "Kaitlyn Morris";
        assertEquals(false, App.RegexUtility.isValidHumanName(invalidName2));
    }

    @Test
    void testIsValidEmail_ValidEmail() {
        String validEmail = "dhammonds@student.neumont.edu";
        assertEquals(true, App.RegexUtility.isValidEmailAddress(validEmail));
        String validEmail2 = "jcopper56@gmail.com";
        assertEquals(true, App.RegexUtility.isValidEmailAddress(validEmail2));
    }

    @Test
    void testIsInvalidEmail_InvalidEmail() {
        String invalidEmail = "dhammondsstudent.neumont.edu";
        assertEquals(false, App.RegexUtility.isValidEmailAddress(invalidEmail));

    }

    @Test
    void testIsPhoneNumber_ValidNumbers() {
        String validPhoneNumber1 = "123-456-7890";
        assertEquals(true, App.RegexUtility.isValidPhoneNumber(validPhoneNumber1));
        String validPhoneNumber2 = "321-654-0987";
        assertEquals(true, App.RegexUtility.isValidPhoneNumber(validPhoneNumber2));
    }

    @Test
    void testIsInvalidPhoneNumber_InvalidNumbers() {
        String invalidPhoneNumber1 = "1234567890";
        assertEquals(false, App.RegexUtility.isValidPhoneNumber(invalidPhoneNumber1));
        String invalidPhoneNumber2 = "(909) 455-5555";
        assertEquals(false, App.RegexUtility.isValidPhoneNumber(invalidPhoneNumber2));
    }

    @Test
    void testIsSSN_ValidNumbers() {
        String validSSN1 = "321-21-9281";
        assertEquals(true, App.RegexUtility.isValidSSN(validSSN1));
        String validSSN = "123-41-1234";
        assertEquals(true, App.RegexUtility.isValidSSN(validSSN));
    }

    @Test
    void testIsInvalidSSN_InvalidSSN() {
        String invalidSSN1 = "921-23-3214"; // cannot include 9 as the first digit
        assertEquals(false, App.RegexUtility.isValidSSN(invalidSSN1));
        String invalidSSN2 = "98-908-9089";
        assertEquals(false, App.RegexUtility.isValidSSN(invalidSSN2));
    }

    @Test
    void testIsValidPassword() {
        String validPassword1 = "Skmsakn123!";
        assertEquals(true, App.RegexUtility.validatePasswordComplexity(validPassword1));
        String validPassword2 = "Dhammonds31231213!";
        assertEquals(true, App.RegexUtility.validatePasswordComplexity(validPassword2));
    }

    @Test
    void testIsValidHTML() {
        String validHtml1 = "<br/>";
        assertEquals(true, App.RegexUtility.getHTMLTagsContents(validHtml1));
        String validHtml2 = "<table>";
        assertEquals(true, App.RegexUtility.getHTMLTagsContents(validHtml2));

    }

    @Test
    void testHtmlUrl_ValidURL() {
        String validHTMLURL = "<a href='test'>";
        assertEquals(true, App.RegexUtility.getHTMLLinkURL(validHTMLURL));

    }
}
