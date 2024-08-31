package lk.ijse.springwithmvc.config;

import lk.ijse.springwithmvc.tmp.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "lk.ijse.springwithmvc")
@EnableWebMvc   // mvc full suport eka labenne me anotation eka use karama   webapp kiyana me clz eka derect sambanda wenne mekata ce nisa mekata witarai danne root config ekata one naha
public class WebAppConfig {

}