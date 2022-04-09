import java.util.Scanner;
import java.util.StringTokenizer;

public class BelajarClasses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input : ");
        String data = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(data," ");
//      Tokenzer ini men-split data satu persatu atau secara lazy
//      sedangkan split langsung memisahkan data secara keseluruhan, lebih boros memori
        while (tokenizer.hasMoreTokens()) {
            String temp = tokenizer.nextToken();
            String result = temp.substring(0,1).toUpperCase() + temp.substring(1);
            System.out.print(result + " ");
        }
    }
}
