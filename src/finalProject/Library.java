package finalProject;

import java.util.ArrayList;

public class Library {

	private String name;
	private ArrayList<Book> books;
	private ArrayList<Customer> customers;
	private ArrayList<Borrowing> borrowing;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public Library(String name) {
		super();
		this.name = name;
		this.books = new ArrayList<Book>();
		this.customers = new ArrayList<Customer>();
		this.borrowing = new ArrayList<Borrowing>();
	}

	public void addBook(Book book) {
		books.add(book);

	}

}
