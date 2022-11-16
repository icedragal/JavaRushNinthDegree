public class Main {
    public static void main(String[] args) {
        System.out.println(ninthDegree(2));
    }

    public static long cube(long x) {
        return x*x*x;
    }

    public static long ninthDegree(long x) {
        return cube(cube(x));
    }
}