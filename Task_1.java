/**
 * Task_1
 */
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Sample Intput");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] arr = new int [1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i*i*i;
        }
        System.out.println("Sample Output");
        System.out.println(arr[n]);
        System.out.println(arr[m]);
    }
    
}