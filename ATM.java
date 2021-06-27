import java.util.Scanner;
public class ATM{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int balance = 500;
		int deposit, withdraw;
		while(true){
			System.out.println("Type 1 for withdraw");
			System.out.println("Type 2 for deposit");
			System.out.println("Type 3 for Check balance");
			System.out.println("Type 4 for Exit");
			System.out.println("Enter your choice:");
			int choice = input.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter money to withdraw:");
					withdraw = input.nextInt();
					if(balance >= withdraw){
						balance = balance - withdraw;
						System.out.println("Please collect your money.");
					}
					else{
						System.out.println("Insufficient balance");
					}
					break;
				case 2:
					System.out.println("Enter money to deposit:");
					deposit = input.nextInt();
					balance = balance + deposit;
					System.out.println("Successfully deposited");
					break;
				case 3:
					System.out.println("Balance: " + balance);
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("Enter a valid option!!!");
			}
		}
	}
}