import java.util.Scanner;

/**
 * @author hp
 *
 */
public class Factorial {

	public static void main(String[] args) {
		
				Scanner scan=new Scanner(System.in);{
				
				System.out.println("Enter a number : ");
				int number=scan.nextInt();
				
				bigInteger fact=1;
				int i=1;
				
				if(number <0) {
					System.out.println("Factorial doesn't exists");
				}
				
				else if(number==0) {
					System.out.println("Factorial of 0 is 1");
				}
				
				else {
					while( i <= number ){  
			            fact = fact * i;   
			            i++; //increment i by 1   
			        }  
			        System.out.print("Factorial of " + number + " is " + fact);
					scan.close();													

		}

	}

}
}
