import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>() {
            {
                add("D");
                add("E");
                add("F");

            }
        };

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
