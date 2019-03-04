import java.util.*;
class Calculator
{
	public static void main(String S[])
	{
		 double num1, num2, answer; 
		 int choice;
		 System.out.println("This is Calculator:");
		 System.out.println("Enter your no. 1: ");
		 Scanner calc = new Scanner(System.in);
		 num1 = calc.nextDouble();
		 System.out.println("Enter your no. 2: ");
		 num2 = calc.nextDouble();
		 System.out.println("Now its time for Operations::: ");
		 System.out.println("Press 1 for addition.");
		 System.out.println("Press 2 for substraction.");
		 System.out.println("Press 3 for division.");
		 System.out.println("Press 4 for multiplication.");
		 System.out.println("Enter Desired choice::: ");
		 choice = calc.nextInt();
		 switch(choice)
		 {
			 case 1:answer = num1 + num2; 
					System.out.println("Answer for Operation Addition is " + answer);
					break;
			 case 2:answer = num1 - num2; 
					System.out.println("Answer for Operation substraction is " + answer);
					break;
			 case 3:answer = num1 / num2; 
					System.out.println("Answer for Operation division is " + answer);
					break;
			 case 4:answer = num1 * num2; 
					System.out.println("Answer for Operation multiplication is " + answer);
					break;
			 default:System.out.println("Enter Valid Operation");
					break;
		 }
	}
};