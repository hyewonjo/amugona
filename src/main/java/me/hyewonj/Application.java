package me.hyewonj;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author hyewonjo
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // 인자로 SpringBootApplication 애노테이션이 붙어있는 클래스를 넘긴다.
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
