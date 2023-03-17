package darko.springframework5.springstereotypes;

import darko.springframework5.springstereotypes.controllers.PetsController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = {"darko.springframework5.springstereotypes","com.springframework5.pets"})
@SpringBootApplication
public class SpringStereotypesApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpringStereotypesApplication.class, args);
        PetsController petsController =(PetsController) ctx.getBean("petsController");
        System.out.println(petsController.getBestPet());
    }

}
