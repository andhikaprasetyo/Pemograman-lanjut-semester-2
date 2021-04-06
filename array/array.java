package Array;

public class Array {
    private static double[] Array;

    public static void main(String[] args){
        double sum = 0.0;
        for (int x = 0; x < 4; x++) {
            sum += Array [x];
        }

        System.out.println(sum);


    }
}