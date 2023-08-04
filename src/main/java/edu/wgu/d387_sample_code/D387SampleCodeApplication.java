package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.controllers.WelcomeMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;
import java.util.Locale;
import java.util.Properties;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		WelcomeMessage displayMessageEnglish = new WelcomeMessage(Locale.US);
		WelcomeMessage displayMessageFrench = new WelcomeMessage(Locale.CANADA_FRENCH);
		Thread englishThread = new Thread(displayMessageEnglish);
		Thread frenchThread = new Thread(displayMessageFrench);
		englishThread.start();
		frenchThread.start();

	}
}
