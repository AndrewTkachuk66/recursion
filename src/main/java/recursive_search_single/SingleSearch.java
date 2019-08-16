package recursive_search_single;

public class SingleSearch {
    int n = 7;
    int c = 0;
    int[] array = new int[10];
    boolean[] used = new boolean[10];

    public void search(int ind) {
        if (ind == n) {
            print();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (used[i]) continue;
            array[ind] = i;
            used[i] = true;
            search(ind + 1);
            used[i] = false;
        }
        ;
    }

    public void print() {
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
            count++;
        }
        System.out.println();
        System.out.print("----" + count + "------");
        if (count == 7) c++;
        System.out.println("c=" + c);
    }

    public static void main(String[] args) {
        SingleSearch search = new SingleSearch();
        search.search(0);
    }
}
