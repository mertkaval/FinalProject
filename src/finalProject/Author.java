package finalProject;

import java.time.LocalDate;

public class Author extends Person {

	private String Pseudonym;
	private Genre speciality;
	/**
	 * @return the pseudonym
	 */
	public String getPseudonym() {
		return Pseudonym;
	}
	/**
	 * @param pseudonym the pseudonym to set
	 */
	public void setPseudonym(String pseudonym) {
		Pseudonym = pseudonym;
	}
	/**
	 * @return the speciality
	 */
	public Genre getSpeciality() {
		return speciality;
	}
	/**
	 * @param speciality the speciality to set
	 */
	public void setSpeciality(Genre speciality) {
		this.speciality = speciality;
	}
	/*
	 * constructer for author class
	 */
	public Author(String firstName, String lastName, LocalDate dateOfBirth,String Pseudonym,Genre speciality ) {
		super(firstName, lastName, dateOfBirth);
		// TODO Auto-generated constructor stub
		this.Pseudonym=Pseudonym;
		this.speciality=speciality;
	}
	
	
}
