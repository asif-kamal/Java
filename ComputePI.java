
public class ComputePI {
    public static void main (String[] args) {
        double sum = 0.0;
        int MAX_DENOMINATOR = 1000;
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2){

        if (denominator % 4 == 1) {
            sum += 1/denominator;
            System.out.println(sum);
            } else if (denominator % 4 == 3) {
                sum -= 1/denominator;
            } else {
                System.out.println("Impossible!!!");
            }
        }
       
    }
}


//Unresolved:
//Why do we do a modulo operation on the denominator by 4?