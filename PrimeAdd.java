import java.util.ArrayList;

public class PrimeAdd {
    public static void findPrimeSum(int n) {

        ArrayList<Integer> pr = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 2; j < i / 2; j++) {

                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                pr.add(i);
            }
        }

        int i = 0, j = pr.size() - 1;
        while (i <= j) {
            if ((pr.get(i) + pr.get(j)) == n) {
                System.out.println(pr.get(i) + " " + pr.get(j));
                break;
            } else if ((pr.get(i) + pr.get(j)) < n) {
                i++;
            } else {
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int num = 43;
        findPrimeSum(num);
    }
}
