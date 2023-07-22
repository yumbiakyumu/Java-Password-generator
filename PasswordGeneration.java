import java.util.*;

public class PasswordGeneration {
    // Variable to store the last generated password
    private static String lastGeneratedPassword = "";

    public static void main(String[] args) {
        // Output message indicating that the password generated changes every time
        System.out.println("NB. The password generated changes every time and cannot be repeated twice");

        // Define the length of the generated password
        int length = 10;

        // Call the gen_password method to generate the password and print it
        String generatedPassword;
        do {
            generatedPassword = gen_password(length);
        } while (generatedPassword.equals(lastGeneratedPassword));

        lastGeneratedPassword = generatedPassword;
        System.out.println("Generated Password: " + generatedPassword);
    }

    // Method to generate a randomized password
    static String gen_password(int len) {
        // Define character sets for different types of characters in the password
        String capital_Letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small_Letters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String special_chars = "!@#~$%&*:(){}[]/?-_+=|':.,";

        // Combine all character sets into a single string for generating the password
        String gen_value = capital_Letters + small_Letters + numbers + special_chars;

        // Create a Random object to generate random numbers
        Random random_method = new Random();

        // Create a StringBuilder to build the password
        StringBuilder password = new StringBuilder();

        // Generate the password by picking random characters from gen_value
        for (int i = 0; i < len; i++) {
            password.append(gen_value.charAt(random_method.nextInt(gen_value.length())));
        }

        // Return the generated password
        return password.toString();
    }
}