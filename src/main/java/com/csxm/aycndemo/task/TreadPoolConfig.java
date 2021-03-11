package com.csxm.aycndemo.task;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.aop.interceptor.SimpleAsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * @description: springboot使用Async的线程池大小
 * @author: liutaiyue
 * @time: 2021/2/1 9:24
 * @Version 1.0
 */
@Configuration
@EnableAsync
public class TreadPoolConfig implements AsyncConfigurer {
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        //核心线程池数量，方法: 返回可用处理器的Java虚拟机的数量。
        executor.setCorePoolSize(Runtime.getRuntime().availableProcessors()+1);
        //最大线程数量
        executor.setMaxPoolSize(Runtime.getRuntime().availableProcessors()*2);
        //线程池的队列容量
        executor.setQueueCapacity(Runtime.getRuntime().availableProcessors()*2);
        //线程名称的前缀
        executor.setThreadNamePrefix("this-excutor-");
        // setRejectedExecutionHandler：当pool已经达到max size的时候，如何处理新任务
        executor.initialize();
        return executor;
    }
    /**
    * @描述 异步任务中异常处理
    * @创建人 liutaiyue
    * @时间 2021/2/1 9:26
    * @return org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler
    */
    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return new SimpleAsyncUncaughtExceptionHandler();
    }


}
