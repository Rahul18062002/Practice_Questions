public class BinaryToDecimal {

    public static void binryConversion(int n) {

        String s = Integer.toBinaryString(n);
        System.out.println(s);

        StringBuffer sb = new StringBuffer("");
        int i = 0;
        while (i < s.length()) {
            sb.append((s.charAt(i) == '0') ? '1' : '0');
            i++;
        }
        System.out.println(sb);
        int decimal = Integer.parseInt(sb.toString(), 2);
        System.out.println(decimal);
    }

    public static void main(String[] args) {
        int n = 82;
        binryConversion(n);
    }
}
