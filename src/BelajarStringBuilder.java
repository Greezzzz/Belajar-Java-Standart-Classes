public class BelajarStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("Zaky");
        builder.append(" ");
        builder.append("Syamsuddin");

        String name = builder.toString();

        System.out.println(name);

    }
}
