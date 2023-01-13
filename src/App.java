import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Holiday> holidaysList = Holiday.createHolidaysList();
        
        System.out.println(
                "Para ver a lista de todos os feriados aperte enter ou digite uma data(DD/MM/AAAA) para saber se é feriado.");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        if (word.equals("")) {
            System.out.print(allHolidays(holidaysList));
        } else {
            System.out.print(checkHolidays(holidaysList, word));
        }
        input.close();
    }

    public static String checkHolidays(List<Holiday> holidaysList, String date) {
        List<String> holidaysName = new ArrayList<>();
        List<String> holidaysDate = new ArrayList<>();

        for (int i = 0; i < holidaysList.size(); i++) {
            holidaysName.add(holidaysList.get(i).getName());
            holidaysDate.add(holidaysList.get(i).getDate());
        }

        int holidayIndex = holidaysDate.indexOf(date);

        if (holidayIndex == (-1)) {
            return ("Não é feriado nesta data!");
        }

        String holiday = holidaysName.get(holidayIndex);
        return holiday;
    }

    public static List<String> allHolidays(List<Holiday> holidaysList) {
        List<String> holidays = new ArrayList<>();
        for (int i = 0; i < holidaysList.size(); i++) {
            holidays.add(holidaysList.get(i).getDate() + " - " + holidaysList.get(i).getName());
        }
        return holidays;

    }
}