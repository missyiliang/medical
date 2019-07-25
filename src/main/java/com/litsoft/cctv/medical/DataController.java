package com.litsoft.cctv.medical;

import com.litsoft.cctv.common.AjaxResult;
import com.litsoft.cctv.pojo.AbcTest;
import com.litsoft.cctv.service.DataService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author linsa
 * @date 2019-07-24 9:50
 **/
@Controller
public class DataController {

    @Resource
    DataService dataService;

    /**
     * 导出数据
     * @param request
     * @param response
     * @return
     */
    @ResponseBody
    @RequestMapping("/data")
    public AjaxResult data(HttpServletRequest request, HttpServletResponse response){
        return dataService.findAll();
    }

    @RequestMapping("/list")
    public String list(HttpServletRequest request, HttpServletResponse response){
        return "index";
    }
}
