package DataTypes;
public class DataTypeTypeCastingC {
    public static void main(String[] args) {
        // Widening Casting (Automatic) - converting a smaller type to a larger type
        System.out.println("Widening Casting Examples (Automatic):");
        byte byteValue = 100;
        short shortFromByte = byteValue;      // byte to short
        int intFromShort = shortFromByte;     // short to int
        long longFromInt = intFromShort;      // int to long (fixed variable name)
        float floatFromLong = longFromInt;    // long to float
        double doubleFromFloat = floatFromLong; // float to double

        System.out.println("byte value: " + byteValue);
        System.out.println("short from byte: " + shortFromByte);
        System.out.println("int from short: " + intFromShort);
        System.out.println("long from int: " + longFromInt);
        System.out.println("float from long: " + floatFromLong);
        System.out.println("double from float: " + doubleFromFloat);

        // Narrowing Casting (Manual) - converting a larger type to a smaller type
        System.out.println("\nNarrowing Casting Examples (Manual):");
        double doubleValue = 9.78;
        float floatFromDouble = (float) doubleValue;    // double to float
        long longFromFloat = (long) floatFromDouble;    // float to long
        int intFromLong = (int) longFromFloat;         // long to int
        short shortFromInt = (short) intFromLong;      // int to short
        byte byteFromShort = (byte) shortFromInt;      // short to byte

        System.out.println("double value: " + doubleValue);
        System.out.println("float from double: " + floatFromDouble);
        System.out.println("long from float: " + longFromFloat);
        System.out.println("int from long: " + intFromLong);
        System.out.println("short from int: " + shortFromInt);
        System.out.println("byte from short: " + byteFromShort);

        // Special Cases
        System.out.println("\nSpecial Cases:");
        
        // Character to int (gets ASCII value)
        char ch = 'A';
        int asciiValue = ch;
        System.out.println("char '" + ch + "' to int: " + asciiValue);

        // int to char (converts ASCII value to character)
        int num = 66;
        char charValue = (char) num;
        System.out.println("int " + num + " to char: " + charValue);

        // Potential data loss example
        int largeValue = 130;
        byte smallByte = (byte) largeValue;
        System.out.println("int " + largeValue + " to byte: " + smallByte + " (shows data loss)");
    }
}
