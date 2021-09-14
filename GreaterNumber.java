import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		
		//scanner class declaration
		Scanner scan=new Scanner(System.in);
		
		//input first number
        System.out.println("Enter the first number : ");
		int num1=scan.nextInt();
		
		
		//input second number
		System.out.print("Enter the second number : ");				
		int num2 = scan.nextInt();
		
		
		if(num1>num2) {
			System.out.println("The greater number is num1 = "+ num1);
		}
		else if(num2>num1) {
			System.out.println("The greater number is num2 = "+ num2);
		}
		else {
			System.out.println("Both the numbers are equal");
			
			scan.close();													


		}

	}

}

