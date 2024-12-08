import java.util.HashSet;

public class UniqueCharacters {
    // Entry point for the unique character check feature
    public static void run() {
        // Test string for checking unique characters
        String test = "abcdef";
        // Check if the string has all unique characters
        boolean result = hasUniqueChars(test);
        // Print the result
        System.out.println("Does '" + test + "' have all unique characters? " + result);
    }

    // Method to check if a string has all unique characters
    public static boolean hasUniqueChars(String str) {
        // Use a HashSet to store characters seen so far
        HashSet<Character> charSet = new HashSet<>();
        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            // If the character is already in the set, return false
            if (charSet.contains(c)) {
                return false; // Duplicate found
            }
            // Add the character to the set
            charSet.add(c);
        }
        // If no duplicates are found, return true
        return true; // All characters are unique
    }
}