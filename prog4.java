
public class prog4 {

	public static void main(String[] args) {
		StringBuffer b = new StringBuffer("Ayushi");
		StringBuffer c=b;
		c.append(" Madhuri Dixit");
		System.out.println(b);
		
		System.out.println(c);
		
		
		String  d = new String("Ayushi");
		String e=d;
		
		System.out.println(e.concat("  Radhika"));

	}

}
