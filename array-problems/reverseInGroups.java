import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 7, 8, 10, 11, 43};
        Scanner scanner = new Scanner(System.in);
        int k;
        System.out.print("Enter value of k: ");
        k = scanner.nextInt();
        reverseArray(arr, k);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void reverseArray(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }
}
