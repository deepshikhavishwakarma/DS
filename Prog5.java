//String is immutable
public class Prog5 {
public static void main(String[] args) {
	String k = "ajay";//immutable
	String l = "Meena";
	
	System.out.println(k.hashCode()==l.hashCode());   //false
	
	System.out.println(k.concat(" Devgan")); 
	System.out.println(k);
	System.out.println(k=k.concat(" sharma"));
	System.out.println(k);
	//k=k.append("gcgb"); it will give error because append() work in StringBuffer class
	
	StringBuffer a1 = new StringBuffer("Anushka");//mutable
	//a1 = "megha";
	a1.append("Sharma");
	
	System.out.println(a1.hashCode());
    }
}
// append replce the value at same address but concat change the value at difference address
//what is difference b/w === and .equals()
//what is difference b/w mutable and immutable String
//at is difference b/w constant pool & Non Constant pool
//what is hashcode()