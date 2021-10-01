import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.next();
        System.out.println(allBetweenZeroAndOne(number));
    }

    public static String allBetweenZeroAndOne(String number) {
        int startIndex = number.indexOf('0');
        int endIndex = 0;
        for (int i = number.length() - 1; i > 0; i--) {
            if (number.charAt(i) == '1') {
                endIndex = i;
                break;
            }
        }
        return number.substring(startIndex + 1, endIndex).equals("") ? "PUSTY" : number.substring(startIndex + 1, endIndex);
    }
}
