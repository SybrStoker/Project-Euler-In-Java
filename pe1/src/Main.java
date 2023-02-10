import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int sum = 0;

        for (int digit: findMultiplesOf(3, 1000)) {
            sum += digit;
        }

        for (int digit: findMultiplesOf(5, 1000)) {
            if(digit % 15 == 0) {
                continue;
            }
            sum += digit;
        }

        System.out.println(sum);
    }

    public static ArrayList<Integer> findMultiplesOf(int base, int lim){
        ArrayList<Integer> multiplesOfNum = new ArrayList<>();

        for (int i= base; i < lim; i += base){
            multiplesOfNum.add(i);
        }
        return multiplesOfNum;
    }
}