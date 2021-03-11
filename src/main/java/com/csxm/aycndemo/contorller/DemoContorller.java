package com.csxm.aycndemo.contorller;

import com.csxm.aycndemo.task.TaskDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: TODO
 * @author: liutaiyue
 * @time: 2021/3/11 11:27
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/demo")
public class DemoContorller {
    @Autowired
    private TaskDemo taskDemo;

    @GetMapping("/add-seven")
    public String async(){

        taskDemo.asyncTime("1");
        taskDemo.asyncTime("2");
        taskDemo.asyncTime("3");
        taskDemo.asyncTime("4");
        taskDemo.asyncTime("5");
        taskDemo.asyncTime("6");
        taskDemo.asyncTime("7");
        return "21345";
    }
}
