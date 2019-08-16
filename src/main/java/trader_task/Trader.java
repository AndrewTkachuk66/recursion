package trader_task;

import java.util.Arrays;

public class Trader {
    /**number of towns**/
    int n = 10;
    int[][] array = {{0, 41, 67, 0, 78, 5, 91, 4, 18, 67},{41, 0, 34, 69, 58, 45, 95, 2, 95, 99},{67, 34, 0, 24, 62, 81, 42, 53, 47, 35},{0, 69, 24, 0, 64, 27, 27, 92, 26, 94},{78, 58, 62, 64, 0, 61, 36, 82, 71, 3},{5, 45, 81, 27 ,61, 0, 91, 21, 38, 11},{91, 95, 42, 27, 36, 91, 0, 16, 69, 22},{4, 2, 53, 92, 82, 21, 16, 0, 12, 33},{18, 95 ,47, 26, 71 ,38 ,69 ,12, 0, 73},{67, 99, 35, 94, 3, 11, 22, 33, 73, 0}};
    int[] p = new int[n];
    boolean[] used = new boolean[n];
    int ans = 1000000;
    int count = 0;

    public int count(){
        for (int i = 0; i < p.length; i++) {
            count += p[i];
        }
        return count;
    }

    void rec(int ind, int len) {
        if(len >= ans ) return;
        if (ind == n ) {
            print();
            ans = Math.min(ans, /*count()*/ len + array[p[ind - 1]][0]);
            return;
        }
        for (int i = 1; i <= n-1; i++) {
            if (used[i]) continue;
            p[ind] = i;
            used[i] = true;
            rec(ind + 1, len + array[p[ind - 1]][i]);
            used[i] = false;
        }
    }

    public void print() {
        for (int i = 0; i < p.length ; i++) {
            System.out.print(p[i]);
        }
        System.out.println();
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Trader trader = new Trader();
        trader.p[0] = 0;
        trader.rec(1,0);
    }
}


