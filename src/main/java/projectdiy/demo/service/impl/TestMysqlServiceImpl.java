package projectdiy.demo.service.impl;

import org.springframework.stereotype.Service;
import projectdiy.demo.entity.User;
import projectdiy.demo.mapper.TestMysqlMapper;
import projectdiy.demo.service.TestMysqlService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestMysqlServiceImpl implements TestMysqlService {

    @Resource
    private TestMysqlMapper testMysqlMapper;

    @Override
    public List<User> connectMysql() {
        System.out.println("daole");
        return testMysqlMapper.connectMysql();
    }
}
