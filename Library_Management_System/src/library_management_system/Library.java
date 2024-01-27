
package library_management_system;

import java.util.ArrayList;

public class Library {
   static ArrayList<Book> books;
   static ArrayList<String> borrowers;
    public Library() {
        this.books = new ArrayList<>();
        this.borrowers = new ArrayList<>();
    }

    public void addBook(String title, String ID,boolean available) {
        Book newBook = new Book(title, ID,available);
        books.add(newBook);
        System.out.println("Book added successfully: " + newBook);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the Library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
    public void borrowBook(int bookId, String borrowername) {
        if (bookId >= 0 && bookId < books.size()) {
            Book selectedBook = books.get(bookId);
            if (selectedBook.isAvailable()) {
                addBorrower(borrowername);
                selectedBook.setAvailable(false);
                System.out.println(borrowername + " borrowed: " + selectedBook);
            } else {
                System.out.println("Sorry, the selected book is not available for borrowing.");
            }
        } else {
            System.out.println("Invalid book index.");
        }
    }
    
    public  void displayBorrowers() {
        System.out.println("Borrowers in the Library:");
        for (String borrower : borrowers) {
            System.out.println(borrower);
        }
    }

    public  void addBorrower(String name) {
        borrowers.add(name);
        System.out.println("Borrower added successfully: " + name);
    }
    static void a(){
        System.out.println("static");  
    }
}
