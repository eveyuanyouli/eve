package org.seckill.service.impl;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.TestFree;
import org.seckill.service.TestFreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/*.xml"})
public class TestFreeImplTest {
    @Autowired
  private TestFreeService testFreeService;
    @Test
    public void queryAll() {
        List<TestFree> testFrees = testFreeService.queryAll();
        System.out.println(testFrees);
    }
}
