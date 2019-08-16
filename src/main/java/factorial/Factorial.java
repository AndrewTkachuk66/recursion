package factorial;

public class Factorial {
    public int findFact(int n){
       int res = 1;
       if(n == 1  || n == 0) return res;
       else if (n < 0) System.out.println("Negative number");
       res = n * findFact(n - 1);
        return res;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.findFact(5
        ));
    }
}
