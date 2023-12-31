🔒 Java Password Generator - Create Strong Passwords Easily! 💪

The Java Password Generator is a powerful tool designed to create secure and randomized passwords effortlessly. 🎉 It combines uppercase letters, lowercase letters, numbers, and special characters to ensure a robust and hard-to-crack password. 🚀

🎯 Ideal For: Individuals and organizations seeking a reliable solution to generate strong passwords for their online accounts, applications, or any sensitive data. 🏢👨‍💻👩‍💻

# Password Generation

The `PasswordGeneration` class is a simple Java program that generates strong and randomized passwords using a combination of uppercase letters, lowercase letters, numbers, and special characters. The program ensures that the generated password is unique and won't be repeated twice consecutively.

## Usage

1. Clone or download the `PasswordGeneration.java` file to your local machine.
2. Make sure you have Java installed on your system.
3. Open a terminal or command prompt and navigate to the directory where `PasswordGeneration.java` is located.
4. Compile the Java program using the following command:


5. The program will output a generated password that changes every time you run the program. It ensures that the newly generated password is different from the previous one, preventing repetitions.

## Important Notes

- The length of the generated password can be adjusted by modifying the `length` variable in the `main` method.
- The program uses a combination of uppercase letters, lowercase letters, numbers, and special characters to create a strong and secure password.

## How it works

1. The program starts by printing a message indicating that the password generated changes every time and cannot be repeated twice.

2. The `gen_password` method generates a randomized password of the specified length by combining different character sets of uppercase letters, lowercase letters, numbers, and special characters.

3. To ensure that each generated password is unique and not repeated consecutively, the program compares the newly generated password with the previously generated one. If they are the same, the program regenerates a new password until it is different.

4. The generated password is printed to the console.

## Customize Password Length

To customize the length of the generated password, modify the `length` variable in the `main` method of the `PasswordGeneration.java` file. For example, if you want a password of length 12, change the line:

```java
int length = 10;

You can include this README file alongside your `PasswordGeneration.java` file to provide users with instructions and information about the program.

