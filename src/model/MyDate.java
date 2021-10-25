package model;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate() {

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean isValidDate(int year, int month, int day) {
        if ((year >= 1 && year <= 9999) && (month >= 1 && month <= 12)) {
            if (((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) ||
                    (month == 12)) && (day >= 1) && (day <= 31)) {
                return true;
            } else if (((month == 4) || (month == 6) || (month == 9) || (month == 11)) &&
                    ((day >= 1) && (day <= 30))) {
                return true;
            } else if ((month == 2) &&
                    ((day >= 1) && (day <= 28))) {
                return true;
            } else
                return false;
        }
        return false;
    }



    public int getMonthLastDay(int month) {
        int lastDayOfMonth;
        if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10)) {
            lastDayOfMonth = 31;
        } else if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
            lastDayOfMonth = 30;

        } else {
            lastDayOfMonth = 28;
        }
        return lastDayOfMonth;

    }
}
