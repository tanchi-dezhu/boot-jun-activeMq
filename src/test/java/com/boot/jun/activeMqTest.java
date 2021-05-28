package com.boot.jun;

import com.boot.jun.activeMq.ActiveMqApplication;
import com.boot.jun.activeMq.produce.QueueProduce;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * @author jun
 * @date 2021年05月28日 19:49
 */
@SpringBootTest(classes = ActiveMqApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class activeMqTest {

    @Resource
    private QueueProduce queueProduce;

    @Test
    public void sentTest() throws Exception{
        queueProduce.produceMsg();
    }

}
