
package library_management_system;

import java.util.Scanner;

public class UserMenu {
     private Library library;//
    private Scanner scanner;

    public UserMenu(Library library) {
        this.library = library;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        int choice;
        do {
            System.out.println("\nuser Menu:");
            System.out.println("1. return Book");
            System.out.println("2. Display Books");
            System.out.println("3. Borrower books");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                     System.out.print("Enter the indxboook: ");
                   int bookid=scanner.nextInt();
                     System.out.print("Enter the name: ");
                   String borrowername=scanner.nextLine();
                   library.borrowBook(bookid, borrowername);
                    addBorrower(borrowername);
                    break;
                case 0:
                    System.out.println("Exiting the library system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }

    private void addBook() {
        System.out.print("Enter the title of the new book: ");
        String title = scanner.next();
        System.out.print("Enter the Id of the new book: ");
        String ID = scanner.next();
        library.addBook(title, ID,true);
    }

    private void addBorrower(String name) {
        System.out.print("Enter the name of the new borrower: ");
        library.addBorrower(name);
    }
}
