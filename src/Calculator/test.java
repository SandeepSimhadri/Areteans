package Calculator;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Operations test = new Operations();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the Operator for calculation : ");
        String opr = sc.next();

        /*while (sc.hasNext()) {
            if (sc.hasNextInt())
                System.out.println(sc.nextInt());
            else
                sc.next();
        }*/
        /*test.addition(num1,num2);
        test.substract(num1,num2);
        test.multiplication(num1,num2);
        test.divide(num1,num2);
        test.addition(num1,num2,num3);*/
        switch (opr) {
            case "+":
                System.out.println("Addition is : ");
                test.addition(num1, num2);
                break;
            case "-":
                System.out.println("Substract is : ");
                test.substract(num1, num2);
                break;
            case "*":
                System.out.println("Multiplication is : ");
                test.multiplication(num1, num2);
                break;
            case "/":
                System.out.println("Divide of two numbers is : ");
                test.divide(num1, num2);
                break;
            default:
                System.out.println("Operation not found");
        }
    }
}
