package calculator;

public class BasicCalculator implements Calculator{
    @Override
    public double add(double operand1, double operand2) {
        return operand1 +operand2;
    }

    @Override
    public double subtract(double operand1, double operand2) {
        return operand1-operand2;
    }

    @Override
    public double multiply(double operand1, double operand2) {
        return operand1*operand2;
    }
    @Override
    public double divide(double operand1, double operand2) {
        double res=0.0;
        try {
            res = operand1 / operand2; //when the divid is 0(operand2==0) get Infinity massge and is not enter to catch blok
            }catch (ArithmeticException e){
            System.out.println("ArithmeticException divid By zero ");
            }finally {
            System.out.println("Method Done");
        }
        return res;

    }
}
