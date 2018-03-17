import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        int lengthArray = array.length;
        System.out.println("Исходный массив:");
        int[] newArray = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int j = 0, i = lengthArray - 1; i >= 0; i--) {
            newArray[j++] = array[i];
        }
        System.out.println("Полученный массив:");
        for (int k = 0; k < lengthArray; k++) {
            array[k] = newArray[k];
            System.out.print(array[k] + " ");
        }
    }
}