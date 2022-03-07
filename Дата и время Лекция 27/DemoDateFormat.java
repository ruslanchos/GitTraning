package ru.javarush.lesson27;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DemoDateFormat {

    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        int[] formats = {DateFormat.FULL, DateFormat.LONG, DateFormat.MEDIUM, DateFormat.SHORT};
        for (int df : formats) {
            for (int tf : formats) {
                DateFormat dateFormat = SimpleDateFormat.getDateTimeInstance(df, tf, Locale.ENGLISH);
                String strDateTime = dateFormat.format(date);
                System.out.println(strDateTime);
            }
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        String formattedDate = simpleDateFormat.format(date);
        System.out.println(formattedDate);
        Date date1 = simpleDateFormat.parse("03.03.2022 20:18:43");
        System.out.println(date1);


    }
}
