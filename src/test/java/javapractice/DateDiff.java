package javapractice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDiff {
    public static void main(String[] args) {
        // Define two dates
        LocalDate date1 = LocalDate.of(2023, 10, 26);
        LocalDate date2 = LocalDate.of(2023, 11, 5);

        // Calculate the difference in days
        long daysDifference = ChronoUnit.DAYS.between(date1, date2);

        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);
        System.out.println("Difference in days: " + daysDifference);
    }
}
