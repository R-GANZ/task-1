import java.util.*;

public class MultiplesCount {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        Map<Integer, Integer> multiplesCount = new LinkedHashMap<>();

        for (int divisor = 1; divisor <= 9; divisor++) {
            int count = 0;
            for (int num : numbers) {
                if (num % divisor == 0) {
                    count++;
                }
            }
            multiplesCount.put(divisor, count);
        }

        System.out.println(multiplesCount);
    }
}

