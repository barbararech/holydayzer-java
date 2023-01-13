import java.util.ArrayList;
import java.util.List;

public class Holiday {
  private String date;
  private String name;

  public Holiday(String date, String name) {
    this.date = date;
    this.name = name;
  }

  public String getDate() {
    return date;
  }

  public String getName() {
    return name;
  }
  
  public static List<Holiday> createHolidaysList() {
    List<Holiday> holidays = new ArrayList<>();

    holidays.add(new Holiday("01/01/2023", "Confraternização mundial"));
    holidays.add(new Holiday("21/02/2023", "Carnaval"));
    holidays.add(new Holiday("09/04/2023", "Páscoa"));
    holidays.add(new Holiday("21/04/2023", "Tiradentes"));
    holidays.add(new Holiday("01/05/2023", "Dia do trabalho"));
    holidays.add(new Holiday("08/06/2023", "Corpus Christi"));
    holidays.add(new Holiday("07/09/2023", "Independência do Brasil"));
    holidays.add(new Holiday("12/10/2023", "Nossa Senhora Aparecida"));
    holidays.add(new Holiday("02/11/2023", "Finados"));
    holidays.add(new Holiday("15/11/2023", "Proclamação da República"));
    holidays.add(new Holiday("25/12/2023", "Natal"));

    return holidays;
  }

}
