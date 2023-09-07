public class ExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        }
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero.");
        }
        /*In the given code there is no try and catch block corresponding function call of divide method due to which
        ArithmeticException error was occurred so to fix this error I have used try and catch block corresponding to the
         function call of divide method*/
    }
    public static int divide(

}
    public static int divide(int a, int b) {
        return a / b;
    }
}

