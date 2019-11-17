package main.java;

import io.swagger.annotations.Api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by admin on 2019/6/13.
 */

@Api()
@SpringBootApplication
public class MyJava {

    public static void main(String[] args) {
        SpringApplication.run(MyJava.class, args);
    }
}
