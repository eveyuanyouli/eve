package org.seckill.service.impl;

import org.seckill.dao.TestFreeDao;
import org.seckill.entity.TestFree;
import org.seckill.service.TestFreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestFreeImpl implements TestFreeService {

    @Autowired
    private TestFreeDao testFreeDao;

    @Override
    public List<TestFree> queryAll() {
        return testFreeDao.queryAll();
    }
}
