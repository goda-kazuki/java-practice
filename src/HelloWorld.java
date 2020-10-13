import java.util.HashMap;
import java.util.Map;

public class HelloWorld {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("name", 5);
        map.put("last", 3);

        System.out.println(map.get("name"));

        int number = 10;

        System.out.println(number);

        Integer integer = 100;

        System.out.println(integer.compareTo(100));


    }
}
