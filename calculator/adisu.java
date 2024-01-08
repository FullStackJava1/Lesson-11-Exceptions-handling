package calculator;

public class adisu extends Exception {
    public adisu() {
        System.out.println("AdisuError");
    }

    public adisu(String message) {
        super(message);
    }

}
