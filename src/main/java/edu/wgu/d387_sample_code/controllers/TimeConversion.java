package edu.wgu.d387_sample_code.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@CrossOrigin
public class TimeConversion {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

    public static String printTimeAllZones() {
        String eventTime = "2023-09-13T18:00:00Z";
        ZonedDateTime currentZonedDateTime = ZonedDateTime.parse(eventTime);

        ZoneId etZone = ZoneId.of("America/New_York");
        ZoneId mtZone = ZoneId.of("America/Denver");
        ZoneId utcZone = ZoneId.of("UTC");

        ZonedDateTime etTime = currentZonedDateTime.withZoneSameInstant(etZone);
        ZonedDateTime mtTime = currentZonedDateTime.withZoneSameInstant(mtZone);
        ZonedDateTime utcTime = currentZonedDateTime.withZoneSameInstant(utcZone);

        String etTimeString = etTime.format(formatter);
        String mtTimeString = mtTime.format(formatter);
        String utcTimeString = utcTime.format(formatter);

        return mtTimeString + " MT / " + etTimeString + " ET / " + utcTimeString + " UTC.";
    }
}
