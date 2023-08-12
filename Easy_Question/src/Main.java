import java.util.Scanner;

public class Main {
    public static int getSum(int point) {
        int order = 1, size = 1, sum = 0;
        while (order <= point) {
            for (int count = 0; count < size; count++) {
                sum += size;
                order++;
                if (order > point) break;
            }
            size++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println(getSum(end) - getSum(start - 1));
        scanner.close();
    }
}