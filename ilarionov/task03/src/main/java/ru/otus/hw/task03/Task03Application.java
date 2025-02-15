package ru.otus.hw.task03;

import lombok.SneakyThrows;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Task03Application {

    //-Xms128m -Xmx128m -XX:+HeapDumpOnOutOfMemoryError
    @SneakyThrows
    public static void main(String[] args) {
        SpringApplication.run(Task03Application.class, args);
    }

}
