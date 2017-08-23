package com.lanou.controller;

import com.github.pagehelper.PageInfo;
import com.lanou.bean.Message;
import com.lanou.service.MessageService;
import org.springframework.aop.support.AopUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/8/22.
 */
@Controller
public class MainController {
    @Resource
    private MessageService messageService;

    @RequestMapping("/")
    @ResponseBody
    public List<Message> findAll() {
        List<Message> messageList = messageService.findAll();
        for (Message message : messageList) {
            System.out.println(message);
        }

        return messageList;
    }

//    传进来俩儿参数  在service包装回来一个PageInfo<Message> 所有的其他size": 1,
//    "startRow": 2
//            "endRow": 2
//            "total": 3
//            "pages": 3
//            "list 就出来了
    @RequestMapping("/pagetest")
    @ResponseBody
    public PageInfo<Message> pagetest(@RequestParam("pagenum") Integer pageNum,
                                      @RequestParam("pagesize") Integer pageSize) {
        return messageService.queryPage(pageNum, pageSize);
    }

    @RequestMapping("/test")
    @ResponseBody
    public String gittest(){
        return "bbb";
    }


    public void  test(){
        System.out.println("1111");
    }




    //编辑代码
    @RequestMapping("/branch")
    public String branchTest(){
        return "2";
    }



}
