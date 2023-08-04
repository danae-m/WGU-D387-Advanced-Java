package edu.wgu.d387_sample_code.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/times")
@CrossOrigin(origins = "http://localhost:4200")
public class TimeConvController {

    @GetMapping("/convert")
    public String convertTimeZone() {
        return TimeConversion.printTimeAllZones();
    }

}
