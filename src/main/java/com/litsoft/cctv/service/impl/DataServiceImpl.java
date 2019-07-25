package com.litsoft.cctv.service.impl;

import com.litsoft.cctv.common.AjaxResult;
import com.litsoft.cctv.mapper.AbcTestMapper;
import com.litsoft.cctv.pojo.AbcTest;
import com.litsoft.cctv.service.DataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author linsa
 * @date 2019-07-24 10:49
 **/
@Service
public class DataServiceImpl implements DataService {
    @Resource
    AbcTestMapper abcTestMapper;

    @Override
    public AjaxResult findAll() {
        return new AjaxResult(abcTestMapper.queryList());
    }
}
