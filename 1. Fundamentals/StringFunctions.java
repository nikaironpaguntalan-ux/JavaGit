public class StringFunctions {
    public static void main(String[] args) {
        // Initialize a sample string
        String str = "   Hello, Java World!   ";

        // 1. Length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // 2. Trim whitespace from both ends
        String trimmedStr = str.trim();
        System.out.println("Trimmed string: '" + trimmedStr + "'");

        // 3. Convert string to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase string: " + upperStr);

        // 4. Convert string to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerStr);

        // 5. Extract a substring (from index 7 to 11)
        String substring = str.substring(7, 11); // Extracts "Java"
        System.out.println("Substring (7 to 11): " + substring);

        // 6. Replace characters in a string
        String replacedStr = str.replace("Java", "Python");
        System.out.println("Replaced string: " + replacedStr);

        // 7. Check if string contains a certain sequence of characters
        boolean containsJava = str.contains("Java");
        System.out.println("Contains 'Java': " + containsJava);

        // 8. Check if string starts with a certain prefix
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);

        // 9. Check if string ends with a certain suffix
        boolean endsWithWorld = str.endsWith("World!");
        System.out.println("Ends with 'World!': " + endsWithWorld);

        // 10. Character at a specific index
        char charAtIndex = str.charAt(5);  // Character at index 5 (should be ',')
        System.out.println("Character at index 5: " + charAtIndex);

        // 11. Index of a character or substring
        int indexOfJava = str.indexOf("Java");
        System.out.println("Index of 'Java': " + indexOfJava);

        // 12. Concatenating strings
        String concatStr = str.concat(" Enjoy coding!");
        System.out.println("Concatenated string: " + concatStr);

        // 13. Check if the string is empty
        boolean isEmpty = str.isEmpty();
        System.out.println("Is the string empty? " + isEmpty);

        // 14. Compare two strings (case-sensitive)
        String anotherStr = "Hello, Java World!";
        boolean isEqual = str.equals(anotherStr);
        System.out.println("Are the two strings equal? " + isEqual);

        // 15. Compare two strings (case-insensitive)
        boolean isEqualIgnoreCase = str.equalsIgnoreCase(anotherStr);
        System.out.println("Are the two strings equal (ignore case)? " + isEqualIgnoreCase);
    }
}

