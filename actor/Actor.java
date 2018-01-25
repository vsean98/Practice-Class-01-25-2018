package actor;

public class Actor {
	String firstname;
	String lastname;
	
	
	public Actor(String first,String last) {
		// TODO Auto-generated constructor stub
	firstname=first;
    lastname=last;
	
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Actor actor=new Actor ("Arnold","Schwarzenegger");    
		System.out.println(actor.firstname);
		System.out.println(actor.lastname);
	}

}
