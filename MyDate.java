import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month; // 0-based: 0 = January
    private int day;

    /** No-arg constructor: creates a MyDate for the current date. */
    public MyDate() {
        setDate(System.currentTimeMillis());
    }

    /** Constructs a MyDate from elapsed milliseconds since Jan 1, 1970. */
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    /** Constructs a MyDate with a specified year, month (0-based), and day. */
    public MyDate(int year, int month, int day) {
        this.year  = year;
        this.month = month;
        this.day   = day;
    }

    public int getYear()  { return year;  }
    public int getMonth() { return month; }
    public int getDay()   { return day;   }

    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        year  = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day   = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    @Override
    public String toString() {
        return "Year: " + year + ", Month: " + month + ", Day: " + day;
    }
}
