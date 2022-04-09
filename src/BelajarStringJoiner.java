import java.util.StringJoiner;

public class BelajarStringJoiner {
    public static void main(String[] args) {
        String[] data = {"Zaky", "Syamsuddin", "Pasti", "Sukses"};
        StringJoiner joiner = new StringJoiner(" ","-> "," <-");

        for (String name : data) {
            joiner.add(name);
        }
        System.out.println(joiner.toString());
    }
}
