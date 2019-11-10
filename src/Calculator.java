public class Calculator {

    public int sum(int argument1, int argument2) {
        return (int)(argument1) + (argument2);
    }

    public int subtract (int argument1, int argument2) {
        return argument1 - argument2;
    }

    public int multiply (int argument1, int argument2) {
        return argument1 * argument2;
    }

    public double divide (int argument1, int argument2) {
        if (argument2 == 0) {
            throw new ArithmeticException("Cannot divide by 0");
        }
        return (double)(argument1) / (argument2);
    }

    //public static int returnSomething() {
    //    return 0;
    //}
    // static method runs from class
    // non static needs new object
}
