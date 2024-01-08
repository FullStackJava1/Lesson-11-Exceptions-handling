package calculator;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        BasicCalculator bc=new BasicCalculator();
        int exit=0;
        String opType = null;
        while (exit!=1) {
            System.out.println("Enter the firts Operand");
            double op1 = scanner.nextDouble();
            System.out.println("Select the operation ");
            try {
                scanner.nextLine();
                opType = scanner.nextLine(); //IllegalArgumentException
                if (opType.equals("/") || opType.equals("-") || opType.equals("*") || opType.equals("+")){
                    System.out.println("you Choose the right oprerate : "+opType);
                }else {
                    throw new IllegalArgumentException();
                }
            }catch (IllegalArgumentException e){
                System.out.println("you didn`t the right  select the  type oprerate");
                //throw new IllegalArgumentException();
                continue;

            }

            System.out.println("Enter the second Operand");
            double op2 = scanner.nextDouble();
            switch (opType) {
                case "+":
                    System.out.println(bc.add(op1, op2));
                    break;
                case "-":
                    System.out.println(bc.subtract(op1, op2));
                    break;
                case "*":
                    System.out.println(bc.multiply(op1, op2));
                    break;
                case "/":
                    System.out.println(bc.divide(op1, op2));
                    break;
                default:
                    System.out.println("you  select the wrong  type oprerate");
            }
            System.out.println("to exit Enter 1 ");
            exit=scanner.nextInt();
        }
    }
}
