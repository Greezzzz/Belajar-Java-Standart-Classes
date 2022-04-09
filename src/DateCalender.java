import java.util.Calendar;
import java.util.Date;

public class DateCalender {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        Date date = calendar.getTime();
        System.out.println(date);

    }
}
