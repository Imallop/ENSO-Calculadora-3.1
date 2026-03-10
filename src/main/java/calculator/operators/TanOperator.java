/**
 * @name        Tangent of an angle in degrees
 * @package     calculator.operators
 * @file        TanOperator.java
 * @description 
 */

package calculator.operators;

import static java.lang.Double.NaN;

public class TanOperator implements UnaryOperator {
    private final boolean useDegrees;

    public TanOperator(boolean useDegrees) {
        this.useDegrees = useDegrees;
    }

    @Override
    public Double execute(Double num) {
        double eps = 1e-10;
        if (useDegrees) {
            if (Math.abs(num % 180) < eps) {
                return 0.0;
            } else if (Math.abs(num % 90) < eps) {
                return NaN;
            }
            return Math.tan(Math.toRadians(num));
        } else {
            if (Math.abs(num % Math.PI) < eps) {
                return 0.0;
            } else if (Math.abs(num % (Math.PI / 2)) < eps) {
                return NaN;
            }
            return Math.tan(num);
        }
    }
}
