import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int arrayLength;
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutu n: ");
        arrayLength = input.nextInt();

        int[] list = new int[arrayLength];
        int[] sortedList = new int[arrayLength];

        System.out.println("Dizinin elemanlarını giriniz: ");


        for (int i = 0; i < list.length; i++){
            System.out.print((i + 1) + ". elemanı : ");
            list[i] = input.nextInt();
        }

        System.out.print("Sıralama : ");

        Arrays.sort(list);
        System.out.print(Arrays.toString(list));
    }
}