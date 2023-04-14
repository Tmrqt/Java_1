import java.util.Scanner;


public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Sample Intput");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int m = input.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * m;
        }
        System.out.println("Sample Output");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
