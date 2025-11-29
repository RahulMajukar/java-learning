package DataTypes;
public class NonPrimDT {
    public static void main(String[] args) {
        // String - sequence of characters
        String str = "Hello World";

        // Arrays
        int[] numbers = {1, 2, 3, 4, 5};
        String[] words = {"Java", "Python", "C++"};

        // Wrapper Classes
        Integer integerObj = 100;    // Integer wrapper for int
        Double doubleObj = 10.5;     // Double wrapper for double
        Character charObj = 'A';     // Character wrapper for char
        Boolean boolObj = true;      // Boolean wrapper for boolean

        // Class object
        NonPrimDT obj = new NonPrimDT();

        // Print values
        System.out.println("String value: " + str);
        
        System.out.println("\nArray values:");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nString array values:");
        for(String word : words) {
            System.out.print(word + " ");
        }

        System.out.println("\n\nWrapper class values:");
        System.out.println("Integer object: " + integerObj);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Character object: " + charObj);
        System.out.println("Boolean object: " + boolObj);
        
        System.out.println("Class object: " + obj);
    }
}
