import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        sortList(new ArrayList<>(Arrays.asList(1, 2, 1, 3, 4)));
    }

    public static void sortList (List<Integer> listNums) {
//        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer listNum : listNums) {
            if (listNum % 2 > 0 ) {
                System.out.print(listNum + " ");
            }
        }
        System.out.println();
    }

}