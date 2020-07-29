public class HelloWorld {

    public static void main(String[] args) {
        myPrint(1, "3", "ご", "なな");
        myPrint("いっち");
    }

    public static void myPrint(Object... args) {
        for (Object s : args) {
            System.out.println(s);
        }
    }
}
