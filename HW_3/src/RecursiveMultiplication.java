//Question 2
public class RecursiveMultiplication {
    public static void main (String []args){
        System.out.println(recursiveMultiplication(5,4));
    }
    public static int recursiveMultiplication(int a, int b){

        if (a==1){
            return b;
        }
        else if (b==1) {
            return a;
        }

        else {
            return a+recursiveMultiplication(a,b-1);
        }
    }
}
