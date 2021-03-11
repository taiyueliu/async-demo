package com.csxm.aycndemo.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;


/**
 * @description: 任务
 * @author: liutaiyue
 * @time: 2021/3/11 11:10
 * @Version 1.0
 */
@Component
public class TaskDemo {
    @Async
    public void asyncTime(String name){
        System.out.println("线程名称："+Thread.currentThread().getName() + " be ready to read data!");
        System.out.println(name+"开始时间============="+System.currentTimeMillis());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+"结束时间============="+System.currentTimeMillis());
    }
}
