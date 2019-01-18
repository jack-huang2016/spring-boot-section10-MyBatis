package com.springboot.sample.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.sample.entity.MgrParamScope;
import com.springboot.sample.mapper.MgrParamScopeMapper;

@RestController
public class MgrParamScopeController {
	
	@Autowired
    private MgrParamScopeMapper mgrParamScopeMapper;
	
	@RequestMapping("/search")
    public List<MgrParamScope> select(){
        return mgrParamScopeMapper.selectByParams(null);
    }
}
