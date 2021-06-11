
public class Product1ToN{
    public static void main (String[] args) {
        int product = 1;
        final int LOWERBOUND = 1;   
        final int UPPERBOUND = 10;

        for (int num = LOWERBOUND; num <= UPPERBOUND; ++num) {
            product *= num;
        }

        System.out.println(product);
    }
}