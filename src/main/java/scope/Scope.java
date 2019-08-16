package scope;

public class Scope {
    int n = 3;
    char[] array = new char[100];
    int count = 0;

    public boolean correct(String s) {
        int bal = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[')
                bal++;
            else bal--;
            if (bal < 0) return false;
        }
        return (bal == 0);
    }

    public void rec(int ind, int bal) {
        if (ind == 2 * n) {
            if (bal == 0) {
               /*  if (correct(array.toString())){*/
                print();
            /*}*/
        }
        return;
    }

    array[ind]='(';

    rec(ind +1, bal +1);
        if(bal ==0)return;
    array[ind]=')';

    rec(ind +1, bal -1);
      if(bal == 0) return;
    array[ind]='[';

    rec(ind +1, bal +1);
        if(bal ==0)return;
    array[ind]=']';

    rec(ind +1, bal -1);

}

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        count++;
        System.out.println();
        System.out.println(" count =" + count);
    }

    public static void main(String[] args) {
        Scope scope = new Scope();
        scope.rec(0, 0);
        //System.out.println(scope.correct("[[]][()[)[]([][]]()][]()()(())()"));
    }
}
