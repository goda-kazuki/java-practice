public class HelloWorld {
    public static void main(String[] args) {

        int[] array = {1, 3, 5};

        for (int i : array) {
            if (i == 5) {
                break;
            }

            System.out.println(i);
        }

        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                break;
            }
            System.out.println(i);
        }

    }
}
