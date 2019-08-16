package recursive_search;

import org.w3c.dom.ls.LSOutput;

public class RecursiveSearch {
    /**recursive search long n from 1 to m **/
    int n = 6, m = 4;
    int count = 0;
    int[] arr = new int[6];

    public void search(int ind){
        if(ind == n){
            print();
            return;
        }
        for (int i = 1; i <= m ; i++) {
            /**unique numbers **/
           // if(arr[i]==i)continue;
            arr[ind] = i;
            search(ind + 1);
        };
    }

    public void print(){

        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i]);

        }
        count++;
        System.out.println() ;
        System.out.println("count=" + count);
    }

    public static void main(String[] args) {
        RecursiveSearch recursiveSearch = new RecursiveSearch();
        recursiveSearch.search(0);
    }
}
