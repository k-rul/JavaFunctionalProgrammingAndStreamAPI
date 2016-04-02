import java.util.Arrays;
import java.util.Scanner;

public class Problem1_FilterArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] words = in.nextLine().split(" ");

        Arrays.stream(words).filter(x -> x.length() > 3)
                            .forEach( x ->System.out.print(x + " "));

        //В условието не е посочено изрично, че когато няма стринг, който да отговаря на условието
        //трябва да се изписва (empty) и за това приемам, че програмата не трябва да връща
        //нищо в този случай.
        //Като четох и във форума няма консенсус по въороса.
    }
}
