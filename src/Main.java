public class Main {

    public static void main(String ...args) {
        System.out.println("Hello World!");
        System.out.println("Just do it!");

        int b = add(1L, 10.0f);

        System.out.println(b);

    }

    public static <T extends Number> int add(T number1, T number2) {
        return number1.intValue() + number2.intValue();
    }
}
