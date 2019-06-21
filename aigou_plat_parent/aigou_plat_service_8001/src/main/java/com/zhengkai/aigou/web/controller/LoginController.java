package com.zhengkai.aigou.web.controller;


import com.zhengkai.aigou.domain.Employee;
import com.zhengkai.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController  //@RestController不能返回jsp,html页面，视图解析器无法解析jsp,html页面
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){  //@RequestBody 接受請求的Body中的參數
        //空值判断
        if("oo".equals(employee.getUsername())&&"123".equals(employee.getPassword())){
            return  AjaxResult.me().setObject(null);
        }else{
            return  AjaxResult.me().setSuccess(false).setMsg("操作失败").setObject(null);
        }
    }



    @RequestMapping(value = "/lget",method = RequestMethod.GET)
    public AjaxResult test(){
        return AjaxResult.me();
    }
}
