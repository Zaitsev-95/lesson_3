import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int array[] = {9, 9, 1, 1, 1, 1, 3, 0, 0, 6, 6, 6};
        Arrays.sort(array);
        int arrayLength = array.length;
        boolean newArray[] = new boolean[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            int repeat = 0;
            for (int j = i + 1; j < arrayLength && !newArray[i]; j++) {
                if (array[i] == array[j]) {
                    newArray[j] = true;
                    repeat++;
                }
            }
            if (repeat > 0)
                System.out.println("[" + array[i] + "]- повторений " + (repeat + 1));
        }
    }
}