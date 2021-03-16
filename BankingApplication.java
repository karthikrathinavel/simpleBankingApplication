import java.util.Scanner;
public class BankingApplication{
	public static void main(String[] args){
		BankAccount obj1 = new BankAccount("myname","0101accno");
		obj1.showMenu();
	}
}
class BankAccount{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	BankAccount(String cname,String cid){
		customerName = cname;
		customerId = cid;
	}
	void deposit(int amount){
		if(amount != 0){
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	void withdraw(int amount){
		if(amount != 0){
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	void getPreviousTransaction(){
		if(previousTransaction > 0){
			System.out.println("Deposited: " + previousTransaction);
		}
		else if(previousTransaction < 0){
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		}
		else{
			System.out.println("No transaction occured");
		}
	}
	void showMenu(){
		char option = '0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("WELCOME " + customerName);
		System.out.println("YOUR ID IS " + customerId + "\n");
		System.out.println("A.CHECK BALANCE");
		System.out.println("B.DEPOSIT");
		System.out.println("C.WITHDRAW");
		System.out.println("D.PREVIOUS TRANSACTION");
		System.out.println("E.EXIT");	
		do{
			System.out.println("****************");
			System.out.println("ENTER AN OPTION");
			System.out.println("****************");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			switch(option){
				case 'A':
					System.out.println("****************");
					System.out.println("BALANCE = " + balance);
					System.out.println("****************\n");
					break;
				case 'B':
					System.out.println("****************");
					System.out.println("ENTER AN AMOUNT TO DEPOSIT: ");
					System.out.println("****************");
					int amount = scanner.nextInt();
					deposit(amount);
					System.out.println("\n");
					break;
				case 'C':
					System.out.println("****************");
					System.out.println("ENTER AN AMOUNT TO WITHDRAW: ");
					System.out.println("****************");
					int amount2 = scanner.nextInt();
					withdraw(amount2);
					System.out.println("\n");
					break;
				case 'D':
					System.out.println("****************");
					getPreviousTransaction();
					System.out.println("****************\n");
					break;
				case 'E':
					System.out.println("***EXIT****");
					break;
				default:
					System.out.println("PLEASE ENTER VALID OPTION");
					break;
			}
		}while(option != 'E');
		System.out.println("THANK YOU :)");	
	}
}