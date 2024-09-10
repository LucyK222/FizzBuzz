public class Reduce {
    public static void main(String[] args) {
        int i = 2;
        doreduce(i);
    }

    public static void doreduce(int i) {
        int count = 0;
        while (i > 0) {
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i--;
            }
            count++;
        }
        System.out.println(count);
    }
}
