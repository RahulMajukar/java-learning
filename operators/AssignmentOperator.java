public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Simple assignment
        int c = a;
        System.out.println("Value of c (after simple assignment): " + c);

        // Addition assignment
        c += b; // equivalent to c = c + b
        System.out.println("Value of c (after addition assignment): " + c);

        // Subtraction assignment
        c -= b; // equivalent to c = c - b
        System.out.println("Value of c (after subtraction assignment): " + c);

        // Multiplication assignment
        c *= b; // equivalent to c = c * b
        System.out.println("Value of c (after multiplication assignment): " + c);

        // Division assignment
        c /= b; // equivalent to c = c / b
        System.out.println("Value of c (after division assignment): " + c);

        // Modulus assignment
        c %= b; // equivalent to c = c % b
        System.out.println("Value of c (after modulus assignment): " + c);
    }
}
