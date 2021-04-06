
import java.util.Scanner;
public class IfElseStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nilai : ");
        int nilai = input.nextInt();

        if(nilai >10) {
            System.out.println("iya");
        } else {
            System.out.println("tidak");
        }
    }
}
