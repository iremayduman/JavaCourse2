
public class StudentManager extends UserManager{
	@Override
public void add(User user) {
	
	System.out.println("??renci eklendi: "+user.getFirstName());
}

}
