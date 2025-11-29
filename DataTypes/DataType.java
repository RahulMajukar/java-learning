package DataTypes;
public class DataType {

    public static void main(String[] args) {
        // Integer types
        byte byteVar = 100;          // 1 byte (-128 to 127)
        short shortVar = 10000;      // 2 bytes (-32,768 to 32,767)
        int intVar = 100000;         // 4 bytes (-2^31 to 2^31-1) or (-2,147,483,648 to 2,147,483,647)
        long longVar = 100000L;      // 8 bytes (-2^63 to 2^63-1) or (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)

        // Floating-point types
        float floatVar = 10.5657657657657f;      // 4 bytes (±3.4E-38 to ±3.4E+38)
        double doubleVar =10.5657657657657;    // 8 bytes (±1.7E-308 to ±1.7E+308)

        // Character type
        char charVar = 'A';          // 2 bytes (0 to 65,535)

        // Boolean type
        boolean boolVar = true;      // 1 bit (true or false)

        // Print the variables
        System.out.println("Byte Value: " + byteVar);
        System.out.println("Short Value: " + shortVar);
        System.out.println("Integer Value: " + intVar);
        System.out.println("Long Value: " + longVar);
        System.out.println("Float Value: " + floatVar);
        System.out.println("Double Value: " + doubleVar);
        System.out.println("Character Value: " + charVar);
        System.out.println("Boolean Value: " + boolVar);
    }

}