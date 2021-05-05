
public class Instructor extends User{

	private String department;

	public Instructor(int id, String firstName, String lastName, String department) {
		super(id, firstName, lastName);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
