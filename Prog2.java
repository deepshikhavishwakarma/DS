package Array;

import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name");
		String name = sc.nextLine(); //It will take input(name) from user          name = Deepshikha
		char ch[] = name.toCharArray(); //create array ch and here we used tocharArray() which is used for convert string into character array.
//		for(int i = 0;i<ch.length;i++) {
//			ch[i] = (char)(ch[i]+2);     // it will increase index value  2 and add into i
//			
//		}
//		
//		String k= new String(ch); // convert charArray  into string 
//		System.out.println(k);
//		
		
		
		System.out.println("Enter your Encryption key");
		int key = sc.nextInt();
		
		for(int i=0;i<ch.length;i++) {
			ch[i]=(char)(ch[i]+key);
		}
		
		String k= new String(ch); // convert charArray  into string 
		System.out.println(k);
		
		System.out.println("Enter your decryption key:");
		key = sc.nextInt();
		for(int i = 0;i<ch.length;i++) {
			ch[i] = (char)(ch[i]-key);
		}
		k = new String(ch);
		System.out.println(k);
		
		
		
		
		
	}

}
