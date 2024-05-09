//package myPackage;
//
//public class Calculator {
//    public static double calculate(Operation operation, double num1, double num2) {
//        switch (operation) {
//            case ADDITION:
//                return Addition.add(num1, num2);
//            case SUBTRACTION:
//                return Subtraction.subtract(num1, num2);
//            case MULTIPLICATION:
//                return Multiplication.multiply(num1, num2);
//            case DIVISION:
//                return Division.divide(num1, num2);
//            default:
//                throw new IllegalArgumentException("Invalid operation: " + operation);
//        }
//    }
//}
package myPackage;

public class Calculator {
    public static double performOperation(double num1, double num2, String operationType) {
        Operation operation;
        switch (operationType.toUpperCase()) {
            case "ADDITION":
            case "ADD":
                operation = new Addition();
                break;
            case "SUBTRACTION":
            case "SUB":
                operation = new Subtraction();
                break;
            case "MULTIPLICATION":
            case "MULTIPLY":
                operation = new Multiplication();
                break;
            case "DIVISION":
            case "DIVIDE":
                operation = new Division();
                break;
            default:
                throw new IllegalArgumentException("Invalid operation type: " + operationType);
        }

        return operation.calculate(num1, num2);
    }
}
