package com.wxy.jdbc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

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
    public void insert() {
        log.info("插入数据...");
    }
}
