package com.wxy.jdbc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

/**
 * @Author wangxiaoyuan
 * @Date 19-10-30 下午6:53
 * @Description TODO
 **/
@SpringBootTest
@Slf4j
public class JdbcTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void createTable() {
        String sql = "create table t_user(name varchar(20),age int(2))";
        jdbcTemplate.execute(sql);
        log.info("创建 table...");
    }

    @Test
    public void insert() {
        String sql = "insert into t_user(name,age) values('张三',24)";
        jdbcTemplate.execute(sql);
        log.info("插入 insert...");
    }

    @Test
    public void queryList(){
        String sql = "select * from t_user";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        log.info("查询列表：list = {}",list);
    }

    @Test
    public void update(){
        String sql = "update t_user set age = 20 where name = '张三'";
        jdbcTemplate.execute(sql);
        log.info("修改 update...");
    }
}
