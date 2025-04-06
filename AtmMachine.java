import java.util.Scanner;

class AtmMachine {
    public static void main(String[]args) {
        int balance = 5000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("INDIAN Bank");
            System.out.println("Automated teller machine");
            System.out.println("1 for Withdraw");
            System.out.println("2 for Deposit");
            System.out.println("3 for Check Balance");
            System.out.println("4 for EXIT");
            System.out.println("Choose the operation you want to perform :");
            int n = sc.nextInt();
            switch (n)
            {
                case 1:
                    System.out.println("Enter money to Withdraw");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("please collect your money");
                    }
                    else 
                    {
                        System.out.println("Insufficient balance");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Enter money to be deposited");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your money has been successfully deposited");
                    System.out.println("Balance :" + balance);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Balance :" + balance);
                    System.out.println("");
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}