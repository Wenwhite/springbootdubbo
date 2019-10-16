package team.wenwhite.springboot.dubbo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ProjectName: springbootdubbo
 * @Package: team.wenwhite.springboot.dubbo.controller
 * @ClassName: App
 * @Author: wenbai
 * @Description: ${description}
 * @Date: 2019/10/16 12:15
 * @Version: 1.0
 */
@SpringBootApplication(scanBasePackages = "team.wenwhite.springboot.dubbo")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }

}
