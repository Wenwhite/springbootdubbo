package team.wenwhite.springboot.dubbo.service.impl;

//import org.springframework.stereotype.Service;
import com.alibaba.dubbo.config.annotation.Service;
import team.wenwhite.springboot.dubbo.service.TestService;

/**
 * @ProjectName: springbootdubbo
 * @Package: team.wenwhite.springboot.dubbo.service.impl
 * @ClassName: TestServiceImpl
 * @Author: wenbai
 * @Description: ${description}
 * @Date: 2019/10/15 8:49
 * @Version: 1.0
 */
//@Service    //注意 此处不适用该注解
    // 相当于我们之前在 xml 文件里配置的东西
@Service( version = "1.0", application = "${dubbo.application.id}", protocol = "${dubbo.protocol.id}", registry = "${dubbo.registry.id}" )    //此注解的作用就是创建这个类型的对象，然后作为服务提供者发布出去
public class TestServiceImpl implements TestService {

    @Override
    public String getData(String name) {
        return "result = " + name;
    }
}
