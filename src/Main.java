import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(getNotEvenNun(List.of(1, 2, 1, 3, 4)));
        System.out.println(getEvenNun(Arrays.asList(1, 2, 1, 3, 4)));
        System.out.println(sortNums(Arrays.asList(3, 5, 7, 1, 1, 12, 56, 2, 6, 6, 12, 56)));
        System.out.println(sortEvenNum(Arrays.asList(10, 3, 5, 7, 1, 1, 12, 5, 2, 6, 6, 12, 5)));
        System.out.println(printUniqueWord("Сегодня вечером будет дождь и сегодня вечером будет снег"));
        numberOfRepetitions(List.of("один", "два","два", "три", "три", "три"));
    }
    public static void numberOfRepetitions (List<String> listWorld) {
        Set<String> resultSetString = new HashSet<>();
        for (String s : listWorld) {
            resultSetString.add(s);
        }
        for (String s : resultSetString) {
            int i = 0;
            for (String s1 : listWorld) {
                if (s.equals(s1)) i++;
            }
            System.out.println(s + " " + i);
        }
    }
    public static Set<String> printUniqueWord (String text) {
        Set<String> resultSetString = new HashSet<>();
        List<String> listString = new ArrayList<>(Arrays.asList(text.split(" ")));
        for (String s : listString) {
            resultSetString.add(s);
        }
        return resultSetString;
    }
    public static Set<Integer> sortEvenNum (List<Integer> listNums) {
        Set<Integer> resultSets = new HashSet<>();
        List<Integer> newList = sortNums(getEvenNun(listNums));
//        System.out.println(newList);
        for (Integer n : newList) {
            resultSets.add(n);
        }
        return resultSets;
    }
    public static List<Integer> sortNums(List<Integer> listNums) {
        int counter = 0;
        int change = 0;
        for (int i = 1; i < listNums.size(); i++) {
            int f = 0; // индикатор замены

            for (int j = 1; j < listNums.size(); j++) {
                counter++;
                if (listNums.get(j) < listNums.get(j-1)) {
                    Integer m = listNums.get(j);
                    listNums.set(j, listNums.get(j-1));
                    listNums.set(j-1, m);
                    f = 1; // замена была
                    change ++;
                }
            }
            if (f == 0) break; // если замен не было - выходим
        }
        return listNums;
    }
    public static List<Integer> getNotEvenNun(List<Integer> listNums) {
        List<Integer> resultList = new ArrayList<>();
        for (Integer listNum : listNums) {
            if (listNum % 2 > 0 ) {
                resultList.add(listNum);
            }
        }
        return resultList;
    }
    public static List<Integer> getEvenNun(List<Integer> listNums) {
        List<Integer> resultList = new ArrayList<>();
        for (Integer listNum : listNums) {
            if (!(listNum % 2 > 0 )) {
                resultList.add(listNum);
            }
        }
        return resultList;
    }
}