package com.zhaodf.service.impl;

import com.zhaodf.dao.EmpDao;
import com.zhaodf.dao.LogDao;
import com.zhaodf.service.EmpService;
import com.zhaodf.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 类：EmpServiceImpl
 *
 * @author zhaodf
 * @date 2021/3/11
 */
public class LogServiceImpl implements LogService {
    LogDao logDao;
    public void setLogDao(LogDao logDao) {
        this.logDao = logDao;
    }

    @Override
    public void log() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logDao.log();
    }
}
