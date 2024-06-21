import java.util.*;

public class ATM_PROJECT {
    public static void main(String[] args) {
        int pin = 1234;
        int balance = 10000;

        int AddAmount = 0;
        int TakeAmount = 0;

        String name;
        Scanner sc = new Scanner(System.in);

        // we have to take the input from the user
        System.out.println("Enter your pin");

        int password = sc.nextInt();

        // code arrangement shift+alt+f

        if(password == pin)
        {
            System.out.println("Enter your name :");
            name = sc.next();
            System.out.println("welcome " + name );


            while(true){
                System.out.println("press 1 to check the balance ");
                System.out.println("press 2 to add amount ");
                System.out.println("press 3 to take amount");
                System.out.println("press 4 to take resipt");
                System.out.println("press 5 to exit ");

                int opt = sc.nextInt();
                switch(opt)
                {
                  case 1:
                  System.out.println("your current balance is " + balance);
                  break;
                  case 2:
                  System.out.println("how much amount did you want to Add to your account");
                  AddAmount = sc.nextInt();
                  System.out.println("successfully credited");
                  balance = AddAmount + balance;
                  break;
                  case 3:
                  System.out.println("how much amount did you want to take ");
                  TakeAmount = sc.nextInt();
                  if(TakeAmount>balance)
                  {
                    System.out.println("your balance is insufficient");
                    System.out.println("try less than available balance");
                  }
                  else{
                    System.out.println("Successfully taken");
                    balance = balance-TakeAmount;
                  }
                  break;
                  case 4:
                  
                    System.out.println("welcome to ATM");
                    System.out.println("available balce is "+ balance);
                    System.out.println("Amount deposited"+AddAmount  );
                    System.out.println("Amount taken  "+TakeAmount);
                    System.out.println("Thanks for coming");
              break;
                  
                  default :
                    System.out.println("press the number below 5");
                    break;
                }
                if(opt == 5)
                {
                    System.out.println("Thanksyou");
                    break;
                }

                }
                }
                else{
                  System.out.println("Wrong password");
                }
            }
        

    }
