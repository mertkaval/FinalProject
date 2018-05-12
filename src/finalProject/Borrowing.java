package finalProject;

import java.time.LocalDate;
import java.util.ArrayList;

public class Borrowing {
	
	private Customer customer;
	private ArrayList<Book> books;
	private final int MAXIMUMBOOK=5;
	
	LocalDate borrowDate;
	LocalDate returnDate;
	boolean finished;
	
	public Borrowing(Customer customer) {
		super();
		this.customer = customer;
		this.books = new ArrayList<Book>();
	}
	
	public void addBook(Book book) {
		if(books.size()<MAXIMUMBOOK) {
		books.add(book);
		}
		
	}
	
	
	

}
