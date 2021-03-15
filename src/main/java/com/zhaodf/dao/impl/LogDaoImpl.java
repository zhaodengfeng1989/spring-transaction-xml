package com.zhaodf.dao.impl;

import com.zhaodf.dao.EmpDao;
import com.zhaodf.dao.LogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.Date;

/**
 * 类：EmpDaoImpl
 *
 * @author zhaodf
 * @date 2021/3/11
 */
public class LogDaoImpl implements LogDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void log() {
        long mills = System.currentTimeMillis();
        String content = "日志插入"+mills;
        String sql = "insert into log(content) values(?)";
        jdbcTemplate.update(sql,content);
    }
}
