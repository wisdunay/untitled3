import java.util.*;

public class Homework {
    public static void main(String[] args) {
        new Homework().run();
    }

    private void run() {
        String[] phoneArray = {"SAMSUNG", "LG", "HUAWEI", "Apple", "LG", "Google", "TCL", "HUAWEI"};

        Set<String> oneMark = new HashSet<>(Arrays.asList(phoneArray));
        String[] result = oneMark.toArray(new String[oneMark.size()]);

        System.out.println(Arrays.toString(result));
    }

}

