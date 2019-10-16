package team.wenwhite.springboot.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.wenwhite.springboot.dubbo.service.TestService;

/**
 * @ProjectName: springbootdubbo
 * @Package: team.wenwhite.springboot.dubbo.controller
 * @ClassName: TestController
 * @Author: wenbai
 * @Description: ${description}
 * @Date: 2019/10/16 12:07
 * @Version: 1.0
 */
@RestController
@RequestMapping( "/test" )
public class TestController {

//    @Autowired
    @Reference( version = "1.0", application = "")
    private TestService testService;

    @RequestMapping("/getData/{name}")
    public String getData(@PathVariable("name") String name){
        String data = testService.getData(name);
        return data;
    }

}
