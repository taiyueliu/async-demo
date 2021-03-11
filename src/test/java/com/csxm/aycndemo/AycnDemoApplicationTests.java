package com.csxm.aycndemo;

import com.csxm.aycndemo.task.TaskDemo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class AycnDemoApplicationTests {
    @Autowired
    private TaskDemo taskDemo;
    @Test
    void contextLoads() {
        taskDemo.asyncTime("1");
        taskDemo.asyncTime("2");
        taskDemo.asyncTime("3");
        taskDemo.asyncTime("4");
        taskDemo.asyncTime("5");
        taskDemo.asyncTime("6");
        taskDemo.asyncTime("7");

        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
