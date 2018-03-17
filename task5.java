import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        int myArray[] = {123, -1783, 3, 32, 4, 53, -54, 528, 0};
        int lengthArray = myArray.length;
        for (int i = 0; i < lengthArray; i++) {
            int newIndex = i;
            for (int j = i; j < lengthArray; j++) {
                if (myArray[newIndex] < myArray[j])
                    newIndex = j;
            }
            int t;
            t = myArray[newIndex];
            myArray[newIndex] = myArray[i];
            myArray[i] = t;
        }
        String intArrayString = Arrays.toString(myArray);
        System.out.println("Получаем массив: " + intArrayString);
    }
}