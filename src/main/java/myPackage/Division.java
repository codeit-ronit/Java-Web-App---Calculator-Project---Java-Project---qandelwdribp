//package myPackage;
//
//public class Division {
//    public static double divide(double num1, double num2) {
//        if (num2 == 0) {
//            throw new ArithmeticException("Cannot divide by zero");
//        }
//        return num1 / num2;
//    }
//}
package myPackage;

public class Division implements Operation {
    @Override
    public double calculate(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}
