package ru.javarush.lesson27;

import java.time.*;

public class Java8DemoDateTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2022, Month.MARCH, 3, 20, 32, 00, 1);
        System.out.println(localDateTime);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        Instant currentMoment = Instant.now();
        System.out.println(currentMoment);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        ZoneId zoneIdUTC2 = ZoneId.of("UTC+2");
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(localDateTime, zoneIdUTC2);
        System.out.println(zonedDateTime1);

    }
}
