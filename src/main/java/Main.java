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
        int count = 0;
        for (int i = 97; i <= 122; i++) {
            System.out.print(i + "=" + (char) i + "; ");
            count++;
            if (count%7==0) System.out.println();
        }


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
}
