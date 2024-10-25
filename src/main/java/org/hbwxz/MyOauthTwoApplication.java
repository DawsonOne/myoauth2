package org.hbwxz;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyOauthTwoApplication {
    public static void main(String[] args) throws JsonProcessingException {
        SpringApplication.run(MyOauthTwoApplication.class, args);
    }
}
