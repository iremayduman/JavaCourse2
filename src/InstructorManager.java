
public class InstructorManager extends UserManager{
	@Override
public void add(User user) {
	System.out.println("E�itmen eklendi. "+user.getFirstName());
}

}
