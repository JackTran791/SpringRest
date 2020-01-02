package com.luv2code.springrest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.luv2code.springrest.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class SpringRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestApplication.class, args);
        try {
            // Create object mapper
            ObjectMapper objectMapper = new ObjectMapper();

            // Read JSON file and map/convert to Java POJO
            // data/sample-lite.json
            Student student= objectMapper.readValue(new File("src/main/resources/sample-lite.json"), Student.class);

            // Print firstName and lastName
            System.out.println(student.getFirstName());
            System.out.println(student.getLastName());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
