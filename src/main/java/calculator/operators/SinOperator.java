/**
 * @name        Sine of an angle in Degrees
 * @package     calculator.operators
 * @file        SinOperator.java
 * @description 
 */

package calculator.operators;

public class SinOperator implements UnaryOperator {
    private final boolean useDegrees;

    public SinOperator(boolean useDegrees) {
        this.useDegrees = useDegrees;
    }

    @Override
    public Double execute(Double num) {
        double angle = useDegrees ? Math.toRadians(num) : num;
        return Math.sin(angle);
    }
}
