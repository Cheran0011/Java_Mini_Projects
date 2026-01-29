import java.util.Scanner;
public class ATM_Pro {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

		 int balance=1000;
         int min_bal=500;
        do
        {
            System.out.println("\t\t...Welcome to Our ATM...");
            System.out.println();
            System.out.println("1. Check Balance \n2. Withdraw  \n3. Deposit \n4. Exit");
            System.out.println();
            System.out.print("Enter Your choice : ");
            int choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                {
                    System.out.println("Your Balance will be : " + balance);
                }
                break;
                case 2:
                {
                    System.out.print("Enter amount for Withdraw : ");
                    int amount=sc.nextInt();
                    if(amount<=balance)
                    {
                        balance=balance-amount;
                        if(balance >= min_bal)
                        {
                            System.out.println("Withdraw Successfully....");
                        }
                        else
                        {
                            System.out.println("Need to Maintain minimum Balance...");
                        }
                    }
                    else
                    {
                        System.out.println("Insufficient Balance");
                    }
                }
                break;
                case 3:
                    {
                        System.out.print("Enter Deposited amount : ");
                        int deposit=sc.nextInt();
                        balance=balance+deposit;
                    }
                    break;
                case 4:
                    {
                        System.out.println("");
						break;
                    }
                default:
                    {
                        System.out.println("Invalid Choices...");
                    }
            }
			if(choice==4)
			{
				break;
			}
        }while(true);
		System.out.println("\t\t Thank You for Using our Banking Services....");
    }

}
