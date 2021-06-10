
public class SumAverageRunningInt {
    public static void main (String[] args) {
        int sum = 0;
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;


        for (int num = LOWERBOUND; num <= UPPERBOUND; ++num) {
            sum += num;
        }
        
        average = (double) sum / UPPERBOUND;

        System.out.println(sum + ", " + average);
    }
}

//Thank you to https://programming.guide/java/wrong-results-for-division.html 