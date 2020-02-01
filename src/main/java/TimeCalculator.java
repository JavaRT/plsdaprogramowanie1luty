import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.GregorianCalendar;

public class TimeCalculator {

    /*Stwórz klasę TimeCalculator. Stwórz w niej metodę daysToChristmasEveInfo()
    wyświetlają informację w konsoli z komunikatem: "It's just [ilość dni]to Christmas Eve!".
    Jeżeli pozostało mniej jak 60 dni dodaj w nowej linii "Time to buy gifts". Metoda ta
    niech woła kolejną metode daysToChristmasEve(LocalDate now) do której przekażemy aktualną
    datę na podstawie której zwróci wartość liczbową ilości dni pozostałych do najbliższej
    Wigilii świąt Bożego Narodzenia. Spraw aby metoda była uniwersalna - jak najbliższe święta
    miną, powinna nadal działać. Pamiętaj również o końcówce roku. Użyj klasy LocalDate i jej
    metody now(). Dwie różne daty możesz porównać poprzez ChronoUnit.DAYS.between(). Przetestuj
    też z metody main samą metodę daysToChristmasEve przekazując jej różne daty i drukując wynik.*/

    public void daysToChristmasEveInfo() {
        LocalDate today = LocalDate.now();
        daysToChristmasEveInfo(today);
    }

    public void daysToChristmasEveInfo(LocalDate today) {

            LocalDate christmasEve = LocalDate.of(today.getYear(), 12, 24);
        long result = ChronoUnit.DAYS.between(today, christmasEve);
        String info = "It's just " +  result + " to Christmas Eve!";
        System.out.println(info);
        if (result < 60){
            System.out.println("Time to buy gifts");
        }
    }
}
