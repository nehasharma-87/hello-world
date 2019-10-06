import java.util.ArrayList;

public class bankact {

	
	int bank_act_no = 122743;
	double balance = 1500;
	String customer_name = "Neha";
	String email = "Nehas87@gmail.com";
	int phone = 35837559;
	int count = 0;
	double withdrawalperday= 1000;
	
	double x;
	ArrayList<String> transaction = new ArrayList<String>();
	
	public bankact()
	{
	transaction.add("Customer_name | Bank_act_no | Transaction |  Deposit/Withdrawal Amt | Balance ");
	
	}
			
	public double deposit(double depositamt) {
		
			
		
		if (depositamt >= 50) {
			if (depositamt <= 500) {
				    balance = balance + depositamt;
					System.out.println("$" + depositamt +" is deposited in your A/c and your A/c balance is $" + balance );
					transaction.add(customer_name + " | "+ bank_act_no + " | " + " Deposit |  " + depositamt +" | " + balance);
					count = count +1;
					
					return balance;}
			
			else {
				System.out.println("The deposit allowed in one transaction is maximum $500. Please enter a amount less than or equal to 500");
			}
		}
		else{
			System.out.println("The minimum amount limit to be deposited is $50. ");
		}
		return balance;
		
   }
		
	public double withdraw( double withdrawamt) {
		
		if (withdrawalperday >= withdrawamt) {
			balance = balance - withdrawamt;
		
			withdrawalperday = withdrawalperday - withdrawamt; 
			
			System.out.println("$" + withdrawamt + " is deducted from your a/c and Your A/c balance is $" + balance);
			System.out.println("The remaining withdrawal amount for today is $" + withdrawalperday );
			transaction.add(customer_name + " | "+ bank_act_no + " | " + " Withdrawal |  " + withdrawamt + " | "+ balance);
		}
		else {
			System.out.println("The maximum withdrawal limit is $1000/day. The remaining amount you can withdraw for today is $" + withdrawalperday );
	}
		return balance;
	}
		 public void printdetails() {
			 System.out.println("\n Account details");
			 System.out.println("Bank A/c No.: " + bank_act_no);
			 System.out.println("Customer Name:  " + customer_name);
			 System.out.println("Account Balance: $" + balance);
			 System.out.println("Email id: " + email);
		 System.out.println("A/c Phone no. " + phone);
		 }
		 
		 public void transactionhistory() {
			 for (int i = 0; i < transaction.size(); i++) {
				 System.out.println(transaction.get(i));
			 }
		 }
		 
	}


