package com.springboot.sample.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.springboot.sample.entity.MgrParamScope;
import com.springboot.sample.mapper.MgrParamScopeMapper;

@RestController
public class MgrParamScopeController {
	
	@Autowired
    private MgrParamScopeMapper mgrParamScopeMapper;
	
	@RequestMapping("/search")
    public List<MgrParamScope> select(){
		PageHelper.startPage(1, 5); //分页，第一页的5条数据，下标从1开始，不是从0开始
        return mgrParamScopeMapper.selectByParams(null);
    }
}
