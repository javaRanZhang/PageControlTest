package com.lanou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanou.bean.Message;
import com.lanou.mapper.MessageMapper;
import com.lanou.service.MessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/8/22.
 */
@Service
public class MessageServiceImpl implements MessageService {
    @Resource
    private MessageMapper messageMapper;

    public List<Message> findAll() {
        List<Message> messageList = messageMapper.findAllMessage();

        return messageList;
    }

    public PageInfo<Message> queryPage(Integer pageNum, Integer pageSize) {

        pageNum = pageNum == null ? 1 : pageNum;
        pageSize = pageSize == null ? 5 : pageSize;

        PageHelper.startPage(pageNum,pageSize);

        List<Message> allMessage = messageMapper.findAllMessage();

        //使用PageInfo对查询结果进行包装

        PageInfo<Message> pageInfo = new PageInfo<Message>(allMessage);

        return pageInfo;
    }
}
