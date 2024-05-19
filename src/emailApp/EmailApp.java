package emailApp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continueInput;

        do {
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        // Create Email object
        Email person = new Email(firstName, lastName);

        // Display the person's information
        System.out.println(person.showInfo());
            System.out.print("Do you want to enter details for another employee? (yes/no): ");
            continueInput = sc.nextLine();
        } while (continueInput.equalsIgnoreCase("yes"));

        sc.close();
    }
}
