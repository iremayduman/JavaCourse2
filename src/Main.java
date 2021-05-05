
public class Main {

	public static void main(String[] args) {
		Student student1=new Student(1,"ırem","ayduman","123");
		StudentManager studentManager=new StudentManager ();
		studentManager.add(student1);
		Instructor instructor1=new Instructor(2,"engin","demiroğ","001");
		InstructorManager instructorManager=new InstructorManager  ();
		instructorManager.add(instructor1);

	}

}
