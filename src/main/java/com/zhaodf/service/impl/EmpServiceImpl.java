package com.zhaodf.service.impl;

import com.zhaodf.dao.EmpDao;
import com.zhaodf.service.EmpService;
import com.zhaodf.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 类：EmpServiceImpl
 *
 * @author zhaodf
 * @date 2021/3/11
 */
public class EmpServiceImpl implements EmpService {
    EmpDao empDao;

    public void setEmpDao(EmpDao empDao) {
        this.empDao = empDao;
    }

    @Override
    public void transf() {
        sub();
        save();
    }

    @Override
    public void sub() {
        empDao.sub();
    }

    @Override
    public void save() {
        empDao.save();
    }
}
