import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
////-----------TASK 1 OPEN ----------------
//        int[][] input = {
//                {0, 0, 0, 0, 0, 0, 1},
//                {0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0}};
//        System.out.println(task1(input));
//
////-----------TASK 1 CLOSE ----------------

        //task 2
//        System.out.println(task2(5));


        System.out.println(task3("hello"));

    }

    //ISTALGAN nxm INT ARRAY UCHUN O'RINLI METHOD
    public static int task1(int[][] arr) {

        int x = arr[0].length / 2, y = arr.length / 2, result = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    result = Math.abs(x - j) + Math.abs(y - i);
                    return result;
                }
            }
        }
        return result;
    }


    public static int task2(int n) {
        //TUB SONLAR RO'YHATI HAR QANCHA UZUN BO'LMASIN TARKIBIDA KO'PAYTMASI NO'LL BILAN
        //TUGAYDIGAN 1 TA SON JUFTLIK {2,5} BOR HALOS
        return n >= 5 ? 1 : 0;
    }


    public static String task3(String str) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a","t");
        map.put("b","c");
        map.put("c","d");
        map.put("d","o");
        map.put("e","p");
        map.put("f","y");
        map.put("g","z");
        map.put("h","e");
        map.put("i","f");
        map.put("j","o");
        map.put("k","p");
        map.put("l","a");
        map.put("m","b");
        map.put("n","k");
        map.put("o","l");
        map.put("p","o");
        map.put("q","p");
        map.put("r","s");
        map.put("s","t");
        map.put("t","e");
        map.put("u","f");
        map.put("v","y");
        map.put("x","i");
        map.put("y","l");
        map.put("z","m");
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            newStr.append(map.get(str.substring(i, i + 1)));
        }
        return String.valueOf(newStr);

    }

}
