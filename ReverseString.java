// Java program for Reverse a string
public class ReverseString {

	public static void main(String[] args) {
		
		String str="FACEBOOK";
		int a=str.length();
		char[] b=str.toCharArray();
		
		for(int i=a-1;i>=0;i--) {
			System.out.print(b[i]);
		}
	}
}
