// ! 01. While Sytax
// ! Description : This is a while loop that will continue to run as long as the condition is true.
// ! when u don't the number of iterations, use while loop.

/* Syntax:
    intiliziation(definiing a variable)
        while (condition) {
            code to be executed(logic)
            increment/decrement
        }
 */

public class WhileEx {

    public static void main(String[] args) {

        // Example
        int i = 1;
        while (i <= 5) { // condition

            System.out.println(i); // prints 1, 2, 3, 4, 5

            i++; // increment
        }
    }
}