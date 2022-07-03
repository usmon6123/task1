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


        System.out.println(task3("dasturchi"));

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
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            newStr.append(encodeStr(str.substring(i, i + 1)));
        }
        return String.valueOf(newStr);

    }

    private static String encodeStr(String s) {
        switch (s) {
            case "a":
                return "t";
            case "b":
                return "c";
            case "c":
                return "d";
            case "d":
                return "o";
            case "e":
                return "p";
            case "f":
                return "y";
            case "g":
                return "z";
            case "h":
                return "e";
            case "i":
                return "f";
            case "j":
                return "o";
            case "k":
                return "p";
            case "l":
                return "a";
            case "m":
                return "b";
            case "n":
                return "k";
            case "o":
                return "l";
            case "p":
                return "o";
            case "q":
                return "p";
            case "r":
                return "s";
            case "s":
                return "t";
            case "t":
                return "e";
            case "u":
                return "f";
            case "v":
                return "y";
            case "x":
                return "i";
            case "y":
                return "l";
            case "z":
                return "m";
        }

        return s;
    }
}
