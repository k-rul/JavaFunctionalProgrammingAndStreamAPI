import java.util.Arrays;
import java.util.Scanner;

public class Problem2_SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] arrStr = in.nextLine().split(" ");
        String order = in.nextLine();

        if (order.equals("Ascending")){
            Arrays.stream(arrStr).sorted((s1,s2) -> s1.compareTo(s2)).forEach(x -> System.out.print(x + " "));
        }else {
            Arrays.stream(arrStr).sorted((s1,s2) -> s2.compareTo(s1)).forEach(x -> System.out.print(x + " "));
        }

    }
}
