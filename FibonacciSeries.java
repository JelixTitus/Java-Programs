// Java program for Fibonacci Series
public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a=0,b=1,sum=0;
		
		for(int i=0;i<=5;i++) {
			
			sum=a+b;
			a=b;
			b=sum;
		}
  System.out.println(sum);
	}

}
