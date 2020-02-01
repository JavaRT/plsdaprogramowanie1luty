import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.GregorianCalendar;

public class AppMain {
    public static void main(String[] args) {
        TimeCalculator calc = new TimeCalculator();
        calc.daysToChristmasEveInfo();
        LocalDate christmasEve2 = LocalDate.of(2020, 12, 23);
        LocalDate christmasEve = LocalDate.of(2020, 12, 24);

        long result2 = ChronoUnit.DAYS.between(christmasEve2, christmasEve);
        String info2 = "It's just " +  result2 + " to Christmas Eve!";
        System.out.println(info2);
        if (result2 < 60) {
            System.out.println("Time to buy gifts");
        }
    }
}
