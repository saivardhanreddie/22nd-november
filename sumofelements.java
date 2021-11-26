
import java.util.Scanner;

public class sumofelements {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];
        {
            System.out.println("Sum of numbers  : " + sum);
        }
        sc.close();
    }
}