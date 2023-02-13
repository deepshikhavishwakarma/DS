
public class prog2 {
	public static void main(String[] args) {
 String a= "jai";
 String b = "jai";
 String c = new String("jai");
 String d = new String("jai");
 
 System.out.println(a==b);//true
 System.out.println(b==c);//false
 System.out.println(c.equals(d));//false
 System.out.println(d==a);//false
}
}
//what is difference b/w == and equals()
// == it's a operator that compares 2 variables value and equals() compares object type 

//Constant pool              Non Constant pool
//it compares value            (by memory) when we create a  var and giving it a value by new keyword  it goes in non constant pool


