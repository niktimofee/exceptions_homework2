public class task2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = {9, 1, 8, 2, 7, 3, 6, 4, 5};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}