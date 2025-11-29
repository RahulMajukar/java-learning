package DataTypes;
public class DataTypeMinMaxVal {
    public static void main(String[] args) {
        // Print header
        System.out.println("Java Data Type Ranges\n" + "===================\n");

        // Byte - 1 byte
        System.out.println("Byte (1 byte):");
        System.out.println("Min value: " + Byte.MIN_VALUE);
        System.out.println("Max value: " + Byte.MAX_VALUE);
        System.out.println("Size in bits: " + Byte.SIZE);

        // Short - 2 bytes
        System.out.println("\nShort (2 bytes):");
        System.out.println("Min value: " + Short.MIN_VALUE);
        System.out.println("Max value: " + Short.MAX_VALUE);
        System.out.println("Size in bits: " + Short.SIZE);

        // Integer - 4 bytes
        System.out.println("\nInteger (4 bytes):");
        System.out.println("Min value: " + Integer.MIN_VALUE);
        System.out.println("Max value: " + Integer.MAX_VALUE);
        System.out.println("Size in bits: " + Integer.SIZE);

        // Long - 8 bytes
        System.out.println("\nLong (8 bytes):");
        System.out.println("Min value: " + Long.MIN_VALUE);
        System.out.println("Max value: " + Long.MAX_VALUE);
        System.out.println("Size in bits: " + Long.SIZE);

        // Float - 4 bytes
        System.out.println("\nFloat (4 bytes):");
        System.out.println("Min value: " + Float.MIN_VALUE);
        System.out.println("Max value: " + Float.MAX_VALUE);
        System.out.println("Size in bits: " + Float.SIZE);

        // Double - 8 bytes
        System.out.println("\nDouble (8 bytes):");
        System.out.println("Min value: " + Double.MIN_VALUE);
        System.out.println("Max value: " + Double.MAX_VALUE);
        System.out.println("Size in bits: " + Double.SIZE);

        // Character - 2 bytes
        System.out.println("\nCharacter (2 bytes):");
        System.out.println("Min value: " + (int)Character.MIN_VALUE);
        System.out.println("Max value: " + (int)Character.MAX_VALUE);
        System.out.println("Size in bits: " + Character.SIZE);

        // Boolean - 1 bit
        System.out.println("\nBoolean (1 bit):");
        System.out.println("Valid values: true or false");

        // Additional useful information
        System.out.println("\nSpecial Values:");
        System.out.println("Positive Infinity: " + Double.POSITIVE_INFINITY);
        System.out.println("Negative Infinity: " + Double.NEGATIVE_INFINITY);
        System.out.println("Not a Number (NaN): " + Double.NaN);
    }
}
