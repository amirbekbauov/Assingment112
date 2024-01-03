

import java.util.Date;
import java.util.ArrayList;

class Book {
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
}

public class Reader {
    String Name;
    int CardNumber;
    String faculty;
    Date dateOfBirth;
    String phone;

    public Reader(String fullName, int libraryCardNumber, String faculty, Date dateOfBirth, String phone) {
        this.Name = fullName;
        this.CardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public void takeBook(int numOfBooks) {
        System.out.println(Name + " took " + numOfBooks + " books.");
    }

    public void takeBook(String... bookTitles) {
        StringBuilder message = new StringBuilder(Name + " took books: ");
        for (String title : bookTitles) {
            message.append(title).append(", ");
        }
        message.setLength(message.length() - 2); // Removing the last comma and space
        System.out.println(message);
    }

    public void takeBook(Book... books) {
        ArrayList<String> bookNames = new ArrayList<>();
        for (Book book : books) {
            bookNames.add(book.name);
        }
        System.out.println(Name + " took books: " + String.join(", ", bookNames));
    }

    public void returnBook(int numOfBooks) {
        System.out.println(Name + " returned " + numOfBooks + " books.");
    }

    public void returnBook(String... bookTitles) {
        StringBuilder message = new StringBuilder(Name + " returned the books: ");
        for (String title : bookTitles) {
            message.append(title).append(", ");
        }
        message.setLength(message.length() - 2); // Removing the last comma and space
        System.out.println(message);
    }

    public void returnBook(Book... books) {
        ArrayList<String> bookNames = new ArrayList<>();
        for (Book book : books) {
            bookNames.add(book.name);
        }
        System.out.println(Name + " returned the books: " + String.join(", ", bookNames));
    }

    public static void main(String[] args) {
        // Creating an array of objects
        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Ronaldo", 1234, "Shoot", new Date(), "387-12-12");
        readers[1] = new Reader("Messi", 5678, "Art", new Date(), "843-78-222");
        readers[2] = new Reader("Ibrahimovic", 9012, "Energy", new Date(), "98239-23-2");

        // Example usage of methods
        readers[0].takeBook(3);
        readers[1].takeBook("History", "Dictionary", "Drama");
        readers[2].takeBook(new Book("Drama", "Mbappe"), new Book("Action", "Haaland"), new Book("Book3", "Author3"));

        readers[0].returnBook(2);
        readers[1].returnBook("Adventures", "Dictionary");
        readers[2].returnBook(new Book("Action", "Author1"), new Book("Book3", "Author2"));
    }
}