
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int intOperandA = 4;
        int intOperandB = 2;
        int intSum;
        int intDifference;
        int intProduct;
        int intQuotient;
        int intModulo;
        double doubleOperandA = 6.1;
        double doubleOperandB = 3.2;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;
        double doubleModul;

        intSum = intOperandA + intOperandB;
        intDifference = intOperandA - intOperandB;
        intProduct = intOperandA * intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;
        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;
        doubleModul = doubleOperandA % doubleOperandB;

        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB +   " is "  + intSum);
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        System.out.println("The modulus using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);
        System.out.println("The sum using ints of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        System.out.println("The difference using ints of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The product using ints of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The quotient using ints of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);
        System.out.println("The modulus using ints of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModul);

    }
}