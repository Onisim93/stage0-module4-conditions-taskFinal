package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 1 || month < 1 || month > 12) {
            System.out.println("invalid date");
        }
        else {
            boolean isLeap = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
            switch (month) {
                case 2 -> System.out.println(isLeap ? 29 : 28);
                case 1,3,5,7,8,10,12 -> System.out.println(31);
                default -> System.out.println(30);
            }
        }

    }
}
