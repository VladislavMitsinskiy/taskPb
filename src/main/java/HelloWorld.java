public class HelloWorld {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = a * b;
        int d = a + b;
        int e = a - b;
        double f =  a * 1.0 / b;
        System.out.println(String.format("%d %d %d %f", c, d, e, f));
    }
}
