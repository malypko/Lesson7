public class Main {
    public static void main(String[] args) {
        for (int i = 0; i<10; i++) {
            int hCode = (new Object()).hashCode();
            System.out.println("hashCode = " + hCode);
        }
    }
}
