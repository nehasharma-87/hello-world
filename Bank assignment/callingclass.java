import java.util.Scanner;
import java.io.*;
public class callingclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		bankact call=new bankact(); //instance call(an object from class bankact)
		
        Scanner input = new Scanner(System.in);
        char answer;
        
        do {
       
		System.out.print("Do you want to deposit (Answer Y/N): ");
		answer = Character.toLowerCase(input.next().charAt(0));
		if (answer == 'y') {
		if (call.count < 3) {
	            System.out.print("\n Enter the amount that need to be deposited: $");
	    		double depositamt = input.nextDouble();
	    		System.out.println("Deposit Amount entered = $" + depositamt );
	    		call.deposit(depositamt);
	      	    
	           }
	     else {System.out.println("Your daily no. of transactions limit is is exhanusted.");
	     break;} }
		else {
			break;}
		}while(answer == 'y');
	     
        
	   
		do {
		System.out.print("Do you want to withdraw(Answer Y/N): ");
		answer = Character.toLowerCase(input.next().charAt(0));
		if (answer == 'y') {
		System.out.print("\n Enter the withdrawal amount: ");
		double withdrawalamt = input.nextDouble();
		if (withdrawalamt <= call.balance) {
		System.out.println("Withdrawalamt entered = " + withdrawalamt );
		call.withdraw(withdrawalamt);}
		else {
			System.out.println("You don't have enough balance to withdraw.");
		}}
		else {
			break;
		}
		}while(answer=='y');
		
		
		 
	     System.out.print("Do you want to see the account details (Answer Y/N): ");
	     answer = Character.toLowerCase(input.next().charAt(0));
	     switch(answer) {
	        case 'y':{
	      	  call.printdetails();
	      	  break;
	           }
	        case 'n':{
	      	  System.exit(0);
	      	  break;
	           }		
 

	}
	     call.transactionhistory();
}}