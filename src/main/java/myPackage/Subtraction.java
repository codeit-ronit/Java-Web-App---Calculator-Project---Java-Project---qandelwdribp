//package myPackage;
//
//public class Subtraction {
//    public static double subtract(double num1, double num2) {
//        return num1 - num2;
//    }
//}
package myPackage;

public class Subtraction implements Operation {
    @Override
    public double calculate(double num1, double num2) {
        return num1 - num2;
    }
}
