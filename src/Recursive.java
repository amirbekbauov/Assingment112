

public class Recursive {
    public static void printNumbers(int a, int b) {
        if (a > b) {

            System.out.print(a + " ");
            printNumbers(a - 1, b);
        } else if (a < b) {

            System.out.print(a + " ");
            printNumbers(a + 1, b);
        } else {

            System.out.print(a);
        }
    }

    public static void main(String[] args) {
        int A = 1;
        int B = 10;
        printNumbers(A, B);

        System.out.println();

        A = 10;
        B = 1;
        printNumbers(A, B);
    }

}
