package com.rao.study.elasticjob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@ImportResource(locations = {"classpath:elastic-job.xml"})
@SpringBootApplication(scanBasePackages = {"com.rao.study.elasticjob"})
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }

}
