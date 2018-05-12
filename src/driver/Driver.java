package driver;

import finalProject.Book;
import finalProject.Borrowing;
import finalProject.Customer;
import finalProject.Genre;

import java.time.LocalDate;

import finalProject.Author;
import finalProject.Library;

public class Driver {

	public static void main(String[] args) {
		
		Author author1 = new Author("John", "Tolkien", LocalDate.parse("2007-12-03"), "J.R.R Tolkien", Genre.FICTION);
		System.out.println(author1);
		
		Book book1 = new Book("lord of the ring", author1, 1985, 5, "ab123", Genre.FICTION, 5, 5);
		System.out.println(book1);
		
		Customer customer1 = new Customer("Mert", "Kaval", LocalDate.parse("1992-03-23"), "AB123", true);
		System.out.println(customer1);
		
		Borrowing borrowing1 = new Borrowing(customer1);
		borrowing1.addBook(book1);
		System.out.println(borrowing1);
		
		
		

	}

}
