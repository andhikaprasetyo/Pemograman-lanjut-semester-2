package array;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();

        String rev = "JUPRIADI AKBAR";
        for (char i : arr)
            rev = i + rev;
        System.out.println(rev);
    }
}
