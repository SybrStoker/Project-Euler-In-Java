import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int sum = 0;

        for(int digit: getFibonacciSequence()) {
            if(digit % 2 == 0){
                sum += digit;
            }
        }

        System.out.println(sum);
    }

    public static ArrayList<Integer> getFibonacciSequence(){
        int lim = 4000000;
        int index = 0;
        int number;
        boolean running = true;
        ArrayList<Integer> set = new ArrayList<>();
        set.add(1);
        set.add(2);

        do{
            number = set.get(index) + set.get(index + 1);

            if(number < lim){
                set.add(number);
                index++;
            }else{
                running = false;
            }
        }while (running);
        return set;
    }
}