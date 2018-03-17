import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] intArray = {-9, 6, 0, 444, 123, -213, -12312, 44, 3333, -59};
        int min = intArray[0];
        int max = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (min > intArray[i]) {
                min = intArray[i];
                intArray[i] = 0;
            } else if (max < intArray[i]) {
                max = intArray[i];
                intArray[i] = 99;
            }
        }
        System.out.println("min value= " + min);
        System.out.println("max value= " + max);
        String intArrayString = Arrays.toString(intArray);
        System.out.println(intArrayString);
    }
}