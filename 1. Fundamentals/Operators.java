public class Operators {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus (Remainder)
        
        // 2. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));  // Greater than
        System.out.println("a < b: " + (a < b));  // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to

        // 3. Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT

        // 4. Assignment Operators
        int result = 10;
        System.out.println("\nAssignment Operators:");
        result += 5; // result = result + 5
        System.out.println("result += 5: " + result);
        result -= 3; // result = result - 3
        System.out.println("result -= 3: " + result);
        result *= 2; // result = result * 2
        System.out.println("result *= 2: " + result);
        result /= 4; // result = result / 4
        System.out.println("result /= 4: " + result);
        result %= 2; // result = result % 2
        System.out.println("result %= 2: " + result);

        // 5. Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b; // If a > b, max = a, otherwise max = b
        System.out.println("Maximum of a and b: " + max);

        // 6. Increment/Decrement Operators
        System.out.println("\nIncrement/Decrement Operators:");
        int num = 5;
        System.out.println("num++: " + num++); // Post-increment
        System.out.println("After post-increment, num: " + num);
        System.out.println("++num: " + ++num); // Pre-increment
        System.out.println("num--: " + num--); // Post-decrement
        System.out.println("After post-decrement, num: " + num);
        System.out.println("--num: " + --num); // Pre-decrement
    }
}
