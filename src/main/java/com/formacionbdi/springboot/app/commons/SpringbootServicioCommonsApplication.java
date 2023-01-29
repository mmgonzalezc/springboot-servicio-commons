package com.formacionbdi.springboot.app.commons;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootServicioCommonsApplication {
    /***
     * Quitamos metodo main ya que este proyecto sera libreria
     * @param args
     */
    /*
    public static void main(String[] args) {
        SpringApplication.run(SpringbootServicioCommonsApplication.class, args);
    }*/

}
