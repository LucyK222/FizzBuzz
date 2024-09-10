class Multiples {
    public static void main(String[] args) {
        docount35(1000);
    }

    private static void docount35(int j) {
        int count = 0;
        for (int i = 1; i <= j; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
