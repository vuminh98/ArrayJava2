import java.util.Scanner;

public class DeleteIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap X: ");
        int x = input.nextInt();
        int delindex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                delindex = i;
                arr[i] = 0;
            }
        }
        if (delindex != -1) {
            for (int i = delindex; i < arr.length - 1; i++) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            System.out.println("New Array list: ");
            for (int j : arr) {
                System.out.println(j + "\t");
            }
        } else {
            System.out.println(x + "is not an element of array");
        }
    }
}
