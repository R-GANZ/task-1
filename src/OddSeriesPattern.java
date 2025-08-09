
    import java.util.Scanner;

    public class OddSeriesPattern {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.print("Enter a number: ");
            int a = sc.nextInt();


            int count = (a % 2 == 0) ? a - 1 : a;


            for (int i = 1; i <= count; i++) {
                int oddNumber = 2 * i - 1;
                System.out.print(oddNumber);
                if (i < count) {
                    System.out.print(", ");
                }
            }

            sc.close();
        }
    }


