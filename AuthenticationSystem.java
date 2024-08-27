package devopsLab1;

import java.util.HashMap;
import java.util.Scanner;

public class AuthenticationSystem {
    private static HashMap<String, String> users = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Sign Up");
            System.out.println("2. Log In");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (option) {
                case 1:
                    signUp();
                    break;
                case 2:
                    logIn();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void signUp() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        if (users.containsKey(username)) {
            System.out.println("Username already exists. Try another one.");
            return;
        }
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        // Store the username and password in the HashMap
        users.put(username, password);
        System.out.println("Sign up successful!");
    }

    private static void logIn() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        // Check if the username and password match
        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
