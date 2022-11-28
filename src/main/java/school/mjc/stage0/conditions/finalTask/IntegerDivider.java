package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        try {
            int result = dividend / divider;
            if (result * divider == dividend) System.out.println("can be divided completely");
            else System.out.println("cannot be divided completely");
        }
        catch (ArithmeticException e) {
            System.out.println("division by zero");
        }
    }
}
