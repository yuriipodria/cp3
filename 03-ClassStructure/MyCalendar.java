public class MyCalendar {

    static int year;
    static int month;
    static int day;

    static String myDate() {
        return String.format("%d-%d-%d", year, month, day);
    }

    static String monthName() {
        switch (month) {
            case 1:
                return "January";

            case 2:
                return "February";

            case 3:
                return "March";

            case 4:
                return "April";

            case 5:
                return "May";

            case 6:
                return "June";

            case 7:
                return "July";

            case 8:
                return "August";

            case 9:
                return "September";

            case 10:
                return "October";

            case 11:
                return "November";

            case 12:
                return "December";

            default:
                return "Invalid month";
        }
    }

    static int days() {
        int[] monthLengths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sumOfDays = 0;

        for (int i = 0; i < month; i++) {
            sumOfDays += monthLengths[i];
        }

        return sumOfDays + day;
    }

    public static void main(String[] args) {
        MyCalendar.year = 2024;
        MyCalendar.month = 5;
        MyCalendar.day = 12;

        System.out.println(MyCalendar.monthName());
    }
}