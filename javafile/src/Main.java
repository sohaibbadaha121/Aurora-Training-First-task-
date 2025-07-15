import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static double add(double a, double b){
        return a+b;
    }

    public  static double sub( double a, double b){
        return a-b;
    }

    public static double mult( double a ,double b){
        return a*b;
    }

    public static double div(double a ,double b){

        if(b!=0){
            return a/b;
        }
        else {
            System.out.println("cannot divide by zero!!");
        }
        return a/b;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        boolean continu = true; // if the user wants to do more than one operation for the same numbers
        //ask the user to enter first number
        System.out.printf("enter the first number:");
        double num1= scanner.nextDouble();
        //ask the user to enter the second number
        System.out.printf("enter the second number :");
        double num2= scanner.nextDouble();
        // the menu
        while (continu){
            System.out.println(" enter your choice to do the operation");
            System.out.println("1.add");
            System.out.println("2.subtract");
            System.out.println("3.multiply");
            System.out.println("4.divide");

            int choice = scanner.nextInt();
            double result;
            switch (choice) {

                case 1:
                    result=add(num1,num2);
                    System.out.println("result:"+result);
                    break;

                case 2:
                    result=sub(num1,num2);
                    System.out.println("result:"+result);
                    break;

                case 3:
                    result=mult(num1,num2);
                    System.out.println("result:"+result);
                    break;

                case 4:
                    result=div(num1,num2);
                    System.out.println("result:"+result);
                    break;


                default:
                    System.out.println("invalid choice !!");
                    continue;

            }

            System.out.println("do you want to do other operation for the same numbers (y/n)? ");
            char again =scanner.next().charAt(0);

            if(again != 'y'){
                continu =false;
            }

        }

        scanner.close();

    }
}