import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);// 2 4 8 16 32
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < intList.size(); i++) {
            int x = intList.get(i);
            if (x > 0) {
                list1.add(x);
            }
        }
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            int x = list1.get(i);
            if (x % 2 == 0) {
                list2.add(x);
            }
        }
        Collections.sort(list2);
        for (int x : list2) {
            System.out.print(x + " ");
        }


    }
}