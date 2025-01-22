import java.util.Arrays;

public class PrintString {
    public static void sortAndPrint(String[] str) {

        Arrays.sort(str);

        for (String s : str) {
            if (isStartWithVowel(s)) {
                System.out.println(s);
            }
        }
    }

    public static boolean isStartWithVowel(String s) {

        s = s.toLowerCase();

        return (s.charAt(0) == 'a' ||
                s.charAt(0) == 'e' ||
                s.charAt(0) == 'i' ||
                s.charAt(0) == 'o' ||
                s.charAt(0) == 'u');
    }

    public static void main(String[] args) {
        String[] str = { "Apple", "Mango", "Orange", "Graps" };
        sortAndPrint(str);
    }
}