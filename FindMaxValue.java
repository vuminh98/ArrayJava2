import java.util.Scanner;

public class FindMaxValue {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        }while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
            System.out.print("Property list: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i] + "\t");
                int max = array[0];
                int index = 1;
                for (int k = 0; k < array.length; k++) {
                    if (array[i] > max) {
                        max = array[i];
                        index = k + 1;
                    }
                }
                System.out.println("The largest property value in the list is "+ max + " ,at position " + index);
            }
        }
    }
}
