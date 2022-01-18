package app.config;

import app.model.Animal;
import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean(name = "beanDog")
    public Animal getDog() {
        Animal dog = new Dog();
        return dog;
    }

    @Bean(name = "beanTimer")
    public Timer getTimer() {
        Timer timer = new Timer();
        return timer;
    }
}



//
//@Configuration
//public class AppConfig {
//
//    @Bean(name = "helloworld")
//    public HelloWorld getHelloWorld() {
//        HelloWorld helloWorld = new HelloWorld();
//        helloWorld.setMessage("Hello World!");
//        return helloWorld;
//    }
//
//    @Bean(name = "catBean")
//    @Scope("prototype")
//    public Cat getCat() {
//        Cat cat = new Cat();
//        System.out.println("Meow meow");
//        return cat;
//    }
//}