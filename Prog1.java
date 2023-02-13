package Array;

//Array is a Linear Or Static data Structure
// It is a  collection of similar datatype(Continous memory)
//Array have fixed size

//We can create array by two type   1). Normal Array(by index value)   2). Anonymous array{by sequence values}


public class Prog1 {
	public static void test(int x,int y) {
		  if(x>y) {
			    System.out.println(x);
			  //return x;
			  }
			  else {
				  //return y;
				  System.out.println(y);
			  }
		  }
  public static void main(String[] args) {
	  String data[] = new String[5];
	  data[0] = "Sweety";
	  data[1]  = "Sandhya"; //Normal array
	  data[2]  = "senha";
	  data[3]  = "radha";
	  data[4]  = "meena";
	  
	  test(4,7);
	  
	  String data1[]= {"Sweety1","Sandhya1","Senha1","radha1","meena1"};   //Anonymous array
	  
	  System.out.println("Girl  is  "+data[2]+"  going to china with "+data[4]);
	  System.out.println("Girl  is  "+data1[2]+"  going to china with "+data1[4]);
	  
		
	  
	  
  }

}
