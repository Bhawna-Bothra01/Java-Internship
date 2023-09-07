//Working Code
public class ArrayManipulation {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
/*If the length of the array is n then the last valid index is n-1.
numbers is an array of length 5 and the last valid index of numbers is 4 but when we look into for loop condition
i<=numbers.length i.e. i<=5, we are using i as index of numbers and we know that the last valid index of numbers is 4
due to which ArrayIndexOutOfBoundsException error occurs so to fix this error we have to traverse the for loop from 0 to n-1
 */


