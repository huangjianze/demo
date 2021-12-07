package projectdiy.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projectdiy.demo.entity.User;
import projectdiy.demo.service.TestMysqlService;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    private TestMysqlService testMysqlService;




    @RequestMapping(value = "/mysql")
    public List<User> testMysql(){
        System.out.println("daocontroller");
        return testMysqlService.connectMysql();
    }
}
