package partition;

public class Partition {
    int c = 0;
    int[] array = new int[35];
    int n = 35;
    public void rec(int ind, int sum, int last){
        if(sum == n){
            print(ind);
            return;
        }
        for (int i = last; i <= n - sum  ; i++) {
            array[ind] = i;
            rec(ind + 1, sum + i, i);
        }
    }
    public void print(int ind){
        for (int i = 0; i < ind ; i++) {
            System.out.print(array[i]);
        };
        c++;
        System.out.print(" count=" + c);
        System.out.println();
    }

    public static void main(String[] args) {
        Partition partition = new Partition();
        partition.rec(0, 0, 1);
    }
}
