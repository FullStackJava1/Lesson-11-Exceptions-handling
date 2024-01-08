import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int num1;
        int num2;
        Scanner scanner = new Scanner(System.in);
        int nu=1;
        while (nu!=0) {
            try {
                System.out.println("Enter num1");
                num1 = scanner.nextInt();
                System.out.println("Enter num2");
                num2 = scanner.nextInt();
                double rs = num2 / num1;
                System.out.println("the RESULT IS " + rs);
            }catch (ArithmeticException e){
                System.out.println("ArithmeticException divid By zero ");
            }catch (InputMismatchException e) {
                System.out.println("InputMismatchException_worning Type");
                scanner.nextLine();//Clear the input Buffer
            }
             /*
            } catch (Exception e) {
                if (e instanceof ArithmeticException) {
                    System.out.println("ArithmeticException");
                } else if (e instanceof InputMismatchException) {
                    System.out.println("InputMismatchException_ADISU");
                }
            }*/

            System.out.println("To Exit Enter 0");
            nu=scanner.nextInt();
        }
    }
}