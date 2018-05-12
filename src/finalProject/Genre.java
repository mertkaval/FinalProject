package finalProject;

public enum Genre {

	FICTION("fiction"),NONFICTIONS("nonfiction"),SCI_FI("sci_fi"),BIOGRAPHY("biography"),HISTORY("history"),CHILDREN("children");
	
	private String speciality;
	private Genre(String specialty) {
		
		this.speciality=specialty;
		
		
		
	}
}
