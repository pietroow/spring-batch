package br.com.pogtech.csvprocessor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CsvProcessorApplication {

    public static void main(String[] args) {
        System.exit(
                SpringApplication.exit(
                        SpringApplication.run(CsvProcessorApplication.class, args))
        );
    }

}
