package com.zhengkai.aigou.util;


//工具类封z装
public class AjaxResult {
    private  boolean success=true;
    private  String msg="操作成功";
    private Object object;       //返回的数据封装


    public static void main(String[] args) {
        AjaxResult.me().setMsg("操作失败").setSuccess(false).setObject("aaa");
    }

    public static AjaxResult me() {

        return new AjaxResult();
    }

    public AjaxResult() {
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return  this;
    }

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return  this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
