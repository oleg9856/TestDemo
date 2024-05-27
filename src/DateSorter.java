import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 * Marking will be based upon producing a readable, well engineered solution rather than factors
 * such as speed of processing or other performance-based optimizations, which are less
 * important.
 *
 *
 package sample;

 import java.time.LocalDate;
 import java.util.Collection;
 import java.util.List;

 /**
 * Marking will be based upon producing a readable, well engineered solution rather than factors
 * such as speed of processing or other performance-based optimizations, which are less
 * important.
 *
 * Implement in single class. Don't chane constructor and signature method.
 */
public class DateSorter {

    /**
     * The implementation of this method should sort dates.
     * The output should be in the following order:
     * Dates with an 'r' in the month,
     * sorted ascending (first to last),
     * then dates without an 'r' in the month,
     * sorted descending (last to first).
     * For example, October dates would come before May dates,
     * because October has an 'r' in it.
     * thus: (2004-07-01, 2005-01-02, 2007-01-01, 2032-05-03)
     * would sort to
     * (2005-01-02, 2007-01-01, 2032-05-03, 2004-07-01)
     *
     * @param unsortedDates - an unsorted list of dates
     * @return the collection of dates now sorted as per the spec
     */
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        // List to store dates with 'r' in the month
        List<LocalDate> datesR = new ArrayList<>();
        // List to store dates without 'r' in the month
        List<LocalDate> datesWithoutR = new ArrayList<>();

        // Loop through the unsorted dates and add them to the appropriate list
        for (LocalDate date : unsortedDates) {
            if (dateContainsR(date.getMonth())) {
                datesR.add(date);
            } else {
                datesWithoutR.add(date);
            }
        }

        // Sort the dates in ascending order
        datesR.sort(Comparator.naturalOrder());

        // Sort the dates in descending order
        datesWithoutR.sort(Comparator.reverseOrder());

        // Create a new list to store the sorted dates
        List<LocalDate> sortedDates = new ArrayList<>();
        sortedDates.addAll(datesR);
        sortedDates.addAll(datesWithoutR);

        return sortedDates;
    }

    /**
     * Check if the month contains the letter 'r'
     *
     * @param month - the month to check
     * @return true if the month contains 'r', false otherwise
     */
    private boolean dateContainsR(Month month) {
        String monthName = month.name().toLowerCase();
        return monthName.contains("r");
    }
}