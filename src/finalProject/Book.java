package finalProject;

public class Book {

	private String title;
	private Author author;
	private int yearPublished;
	private int whichEdition;
	private String isbn;
	private Genre genre;
    private int numberOfCopies;
    private int copiesAvaiable;
    
	/**
	 * @return the numberOfCopies
	 */
	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	/**
	 * @param numberOfCopies the numberOfCopies to set
	 */
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

	/**
	 * @return the copiesAvaiable
	 */
	public int getCopiesAvaiable() {
		return copiesAvaiable;
	}

	/**
	 * @param copiesAvaiable the copiesAvaiable to set
	 */
	public void setCopiesAvaiable(int copiesAvaiable) {
		this.copiesAvaiable = copiesAvaiable;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the author
	 */
	public Author getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(Author author) {
		this.author = author;
	}

	/**
	 * @return the yearPublished
	 */
	public int getYearPublished() {
		return yearPublished;
	}

	/**
	 * @param yearPublished
	 *            the yearPublished to set
	 */
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	/**
	 * @return the whichEdition
	 */
	public int getWhichEdition() {
		return whichEdition;
	}

	/**
	 * @param whichEdition
	 *            the whichEdition to set
	 */
	public void setWhichEdition(int whichEdition) {
		this.whichEdition = whichEdition;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn
	 *            the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the genre
	 */
	public Genre getGenre() {
		return genre;
	}

	/**
	 * @param genre
	 *            the genre to set
	 */
	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 * 
	 */
	@Override

	public String toString() {

		return String.format(" %s, %s ,%s ,%s , %s,%s ", isbn, title, author.getPseudonym(),
				yearPublished, whichEdition, author.getSpeciality(),numberOfCopies,copiesAvaiable);
	}

	public Book(String title, Author author, int yearPublished, int whichEdition, String isbn, Genre genre,int numberOfCopies,int copiesAvaiable) {
		super();
		this.title = title;
		this.author = author;
		this.yearPublished = yearPublished;
		this.whichEdition = whichEdition;
		this.isbn = isbn;
		this.genre = genre;
		this.numberOfCopies=numberOfCopies;
	    this.copiesAvaiable=copiesAvaiable;	
	
	
	}

}
