import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DateSorter dateSorter = new DateSorter();

        List<LocalDate> dates =
                Arrays.asList(
                        LocalDate.of(2004, 7, 1),
                        LocalDate.of(2005, 1, 2),
                        LocalDate.of(2007, 1, 1),
                        LocalDate.of(2032, 5, 3),
                        LocalDate.of(2021, 9, 15),
                        LocalDate.of(2019, 2, 11),
                        LocalDate.of(2023, 4, 25),
                        LocalDate.of(2018, 6, 18),
                        LocalDate.of(2020, 11, 10),
                        LocalDate.of(2022, 12, 20),
                        LocalDate.of(2017, 3, 5),
                        LocalDate.of(2015, 8, 30),
                        LocalDate.of(2021, 5, 1),
                        LocalDate.of(2016, 7, 7),
                        LocalDate.of(2025, 1, 19),
                        LocalDate.of(2014, 4, 13),
                        LocalDate.of(2023, 9, 9),
                        LocalDate.of(2022, 6, 23),
                        LocalDate.of(2023, 10, 10),
                        LocalDate.of(2011, 1, 20),
                        LocalDate.of(2010, 3, 15),
                        LocalDate.of(2009, 12, 25),
                        LocalDate.of(2008, 11, 30),
                        LocalDate.of(2007, 8, 1)

                );

        Collection<LocalDate> sortedDates = dateSorter.sortDates(dates);

        sortedDates.forEach(System.out::println);
    }
}