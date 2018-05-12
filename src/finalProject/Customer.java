package finalProject;

import java.time.LocalDate;

public class Customer extends Person {

	private String customerID;
	private boolean active;

	/**
	 * @return the customerID
	 */
	public String getCustomerID() {
		return customerID;
	}

	/**
	 * @param customerID
	 *            the customerID to set
	 */
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active
	 *            the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	public Customer(String firstName, String lastName, LocalDate dateOfBirth, String customerID, boolean active) {
		super(firstName, lastName, dateOfBirth);
		// TODO Auto-generated constructor stub
		this.customerID = customerID;
		this.active = active;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s %s %s %s", getFirstName(), getLastName(), getDateOfBirth(), getCustomerID());
	}

}
