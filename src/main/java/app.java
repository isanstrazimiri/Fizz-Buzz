import java.util.Scanner;
public class app {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	int number=0;
	int number1=0;

		
		for(int n=0;n<=5;n++) {
			System.out.println("Enter the number: ");
			number=inp.nextInt();
			System.out.println("please enter the 2 num");
			number1=inp.nextInt();
			if (number == 0 && number1 ==0) throw new IllegalArgumentException("Number must be 0");
			else if (number%3 ==0 && number1%3==0) System.out.println("Fizz"+ "Odd");
			else if (number % 5 ==0 && number1%2==0) System.out.println("Buzz"+ "Even");
			else System.out.println("Its neither Fizz nor Buzz");
						
		}
	}
}
