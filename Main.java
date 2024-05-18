//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
class ATM{
    int pin=1234;
    double Balance;
    Scanner sc=new Scanner(System.in);
    public void  chekPin(){ // pin correct or not
        System.out.println("Enter the PIN: ");
        int enterpin=sc.nextInt();
        if(pin==enterpin){//correct pin
            menu();// located at menu function
        }
        else {
            System.out.println("Invalid PIN.....Enter a Valid PIN");
        }
        chekPin();

    }
    //menu function
    public void  menu(){
        System.out.println("Enter your Choice");
        System.out.println("1. Check A/C Balance ");
        System.out.println("2. Withdraw Money ");
        System.out.println("3. Deposit Money ");
        System.out.println("4. Exit");
        int choice=sc.nextInt();
        switch (choice){
            case 1: CheckBal();
            break;
            case 2: Withdraw();
            break;
            case  3: Deposite();
            break;
            case 4: return;
            default:
                System.out.println("Enter a Valid Choice: 1 2 3 4");
                menu();
        }
    }
    // Check A/C Balance
    public void CheckBal(){
        System.out.println("your A/C Balance is: "+Balance);
        menu();
    }
    public void Withdraw(){
        System.out.println("Enter a Amount for withdraw: ");
        int withdraw=sc.nextInt();
        if(withdraw > Balance){
            System.out.println("Insufficient Balance");
        }
        else {
            Balance=Balance-withdraw;
            System.out.println("withdraw successfully "+withdraw+" RS");
        }
        menu();
    }
    public void Deposite(){
        System.out.println("Enter a amount for Deposite: ");
        int Depoamount=sc.nextInt();
        Balance=Balance+Depoamount;
        System.out.println("Deposte amount successfully "+Depoamount+" RS");
        menu();

    }
}
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        System.out.println("--- WELCOME WELCOME WELCOME ---");

        ATM atm=new ATM();
        atm.chekPin();

    }
}