//package myPackage;
//
//public class Multiplication {
//    public static double multiply(double num1, double num2) {
//        return num1 * num2;
//    }
//}
package myPackage;

public class Multiplication implements Operation {
    @Override
    public double calculate(double num1, double num2) {
        return num1 * num2;
    }
}
