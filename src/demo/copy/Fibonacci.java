package demo.copy;

public class Fibonacci {
   
	public static void main(String[] args) {
		
		int n1=0,n2=1,sum;
		
		for(int i=0;i<10;i++) {
			sum = n1 +n2;
			n1 = n2 ;
			n2 = sum;
			System.out.print(sum +" ");
			
		}
	}
}
