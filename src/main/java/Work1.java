import java.util.*;

public class Work1 {
    public static void main(String[] args) {
        int[] lottery = new int[100];
        int k = 1;
        for (int i = 0; i < lottery.length; i++, k++) {
            lottery[i] = k;
        }
        lotteryShuffle(lottery);
        for (int i = 0; i < 10; i++) {
            System.out.print(lottery[i] + " ");
        }
        System.out.print(" -Первые 10 шариков с цифрами");
    }

    static void lotteryShuffle(int[] temp) {
        Random rnd = new Random();
        for (int i = temp.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int temp2 = temp[index];
            temp[index] = temp[i];
            temp[i] = temp2;
        }
    }
}