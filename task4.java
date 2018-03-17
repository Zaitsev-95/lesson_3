public class task4 {
    public static void main(String[] args) {
        int integ = 123456;
        if (integ % 100 == 12)
            System.out.println("Число: " + integ + " имеет строгую последовательностью чисел");
        else if (integ % 1000 == 123)
            System.out.println("Число: " + integ + " имеет строгую последовательностью чисел");
        else if (integ % 10000 == 1234)
            System.out.println("Число: " + integ + " имеет строгую последовательностью чисел");
        else if (integ % 100000 == 12345)
            System.out.println("Число: " + integ + " имеет строгую последовательностью чисел");
        else if (integ % 1000000 == 123456)
            System.out.println("Число: " + integ + " имеет строгую последовательностью чисел");
        else if (integ % 1000000 == 1234567)
            System.out.println("Число: " + integ + " имеет строгую последовательностью чисел");
        else
            System.out.println("Число: " + integ + " имеет строгую последовательностью чисел");
    }
}