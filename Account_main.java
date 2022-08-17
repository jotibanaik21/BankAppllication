package Encapsulation;
import java.util.Scanner;
class Account
 {   private double bal;
     public double getBal() {return bal;}
     public void setBal(double bal)
     { if(bal>0)
	 this.bal = bal;
	 else System.out.println("Invalid Input");
     }
 }
 
 class Transaction1
  { public static void deposite( double amt,Account ref) 
      {  double b1=ref.getBal();
	     b1=b1+amt;
	     ref.setBal(b1);
	     System.out.println("\n"+b1+" Deposited..");
      }
    public static void withdraw(double amt, Account ref) 
      { double b2 =ref.getBal();
	    b2= b2-amt;
        ref.setBal(b2);
        System.out.println("\n"+b2+" Withdrawn");
      }
    public static void checkBal(Account ref) 
      { double b3=ref.getBal();
	    System.out.println("\nCurrent balance: " +b3);
	  }
}
  
public class Account_main 
{  public static void main(String[] args)
    { Scanner sc=new Scanner(System.in);
	  int c=0;
	  double a=0;
	  Account a1=new Account ();
	  System.out.println("--------Welcome to Canara Bank--------");
	  while(true){
	    System.out.println("\n\nSelect your choice..\n1.Deposite\n2.Withdraw\n3.Check Balance");
		System.out.println("--------------------------------------");
		System.out.print("Enter your choice:");
		try { c=sc.nextInt();}
		catch(Exception e){System.out.print("Enter your choice correctly:");
		sc.nextLine();
		c=sc.nextInt();}
		switch (c) {
		case 1: System.out.print("Enter the amount:");
		        a=sc.nextDouble();
		        Transaction1.deposite(a,a1);
		        break;
		case 2: System.out.println("Enter the amount:");
                a=sc.nextDouble();
			    Transaction1.withdraw(a,a1);
		        break;
		case 3: Transaction1.checkBal(a1);
		        break;
		default :System.out.println("Invalid");
		         break;
		}
		}
	 }

}
