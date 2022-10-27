package regexassignment;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public interface RegexUtility {

        /**
         * Be sure to account for middle name, middle initial, and prefix (Mr, Ms, Miss,
         * Mrs, Dr). Ensure proper capitalization.
         * 
         * @param name the name to check
         * @return true if valid; otherwise false
         */
        public static boolean isValidHumanName(String name) {
            if (name == null) {
                return false;
            }
            String regexString = "[a-zA-Z][a-z][.] [a-zA-Z]{1,} [a-zA-z]{1,} [a-zA-Z]{1,}";
            return name.matches(regexString);
        }

        /**
         * Username must be at least 1 non-numeric character. After the first character
         * and before the '@' can be any alpha (any case)
         * any numeric, and only the symbols '_' and '.'.
         * The domain name section must contain at least a 1 character sub-domain. Again
         * the first character must be alpha (in either case)
         * and the remaining characters can be alpha or numeric. The top-level domain
         * can be 3-4 alphanumeric characters of either case.
         * 
         * @param email the email address to check
         * @return true if valid; otherwise false
         */
        public static boolean isValidEmailAddress(String email) {
            if (email == null) {
                return false;
            }
            String regexString = "^[a-zA-Z0-9+_.]+@[a-zA-Z0-9.]+$";
            return email.matches(regexString);
        }

        /**
         * Of the form CC-AAA-PPP-NNNN or C-AAA-PPP-NNNN or AAA-PPP-NNNN
         * Where CC is the two digit country code,
         * C is a one digit country code
         * AAA is a three digit area code
         * NNNN is the four digit phone number
         * research which digits are allowed in which blocks in phone numbers (some have
         * minimum values)
         * 
         * @param phone the phone number string to check
         * @return true if valid; else false
         */
        public static boolean isValidPhoneNumber(String phone) {
            if (phone == null) {
                return false;
            }
            String regexString = "[0-9]{3}-[0-9]{3}-[0-9]{4}";
            return phone.matches(regexString);
        }

        /**
         * A US compliant SSN
         * reserach what digits are allowed in which locations (some have minimum
         * values)
         * 
         * @param ssn
         * @return
         */
        public static boolean isValidSSN(String ssn) {
            if (ssn == null) {
                return false;
            }
            String regexString = "[0-8][0-9]{2}-[0-9]{2}-[0-9]{4}";
            return ssn.matches(regexString);
        }

        /**
         * Validate that a given password matches the given complexity requirements
         * 
         * @param password   the password to check
         * @param minLength  the minimum length the password is allowed to be
         * @param minUpper   the minimum number of upper case alpha characters the
         *                   password must have
         * @param minLower   the minimum number of lower case alpha characters the
         *                   password must have
         * @param minNumeric the minimum number of numeric characters the password must
         *                   have
         * @param minSymbols the minimum number of non-alphanumeric characters the
         *                   password must have
         * @return
         */
        public static boolean validatePasswordComplexity(String password) {
            if (password == null) {
                return false;
            }
            String regexString = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()!])(?=\\S+$).{8,}$";
            return password.matches(regexString);
        }

        /**
         * Get the content of all occurences of an html tag given it's name and the html
         * string in which it occurs
         * 
         * @param html    the html string to be searched
         * @param tagName the tagName for which the inner content should be returned
         * @return
         */
        public static boolean getHTMLTagsContents(String html) {
            if (html == null) {
                return false;
            }
            String regexString = "<(“[^”]*”|'[^’]*’|[^'”>])*>";
            return html.matches(regexString);
        }

        /**
         * For all occurrences of a link tag ("<a href=..") in the string html
         * return the URL to which the link goes
         * 
         * @param html the string to be searched
         * @return an array of link destinations
         */
        public static boolean getHTMLLinkURL(String html) {
            if (html == null) {
                return false;
            }
            String regexString = "<a\\s+(?:[^>]*?\\s+)?href=([\"\'])(.*?)\\1>";
            return html.matches(regexString);
        }
    }
}
