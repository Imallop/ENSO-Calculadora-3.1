/**
 * @name        Cosine of an angle in Degrees
 * @package     calculator.operators
 * @file        CosOperator.java
 * @description 
 */

package calculator.operators;

public class CosOperator implements UnaryOperator {
    private final boolean useDegrees;

    public CosOperator(boolean useDegrees) {
        this.useDegrees = useDegrees;
    }

    @Override
    public Double execute(Double num) {
        double angle = useDegrees ? Math.toRadians(num) : num;
        return Math.cos(angle);
    }
}
