public class Main {
    public static void main(String[] args) {

        float a = 8.5f;
        float b = 9.45f;
        int c = 10;
        boolean d = (a != 0) && (b !=0) && (a != c) && (b != c) && (a != b) && ((int)a < c) && ((int)b < c);

        if (d && (((float)c - b) < ((float)c - a))) {
            System.out.println("Ближе к числу 10: " + b);
        } else if (d && (((float)c - b) > ((float)c - a))) {
            System.out.println("Ближе к числу 10: " + a);
        } else {
            System.out.println("Введите другие числа");
        }
    }
}