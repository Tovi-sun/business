package com.sunny.business.common;

public class ResultUtil {
    public static Result success(){
        Result result = new Result();
        result.setCode(200);
        result.setMsg("成功");
        return result;
    }

    public static Result success(String msg){
        Result result = new Result();
        result.setCode(200);
        result.setMsg(msg);
        return result;
    }

    public static <T> Result success(T data){
        Result result = new Result();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(data);
        return result;
    }

    public static <T> Result success(String msg,T data){
        Result result = new Result();
        result.setCode(200);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static Result error(String msg){
        Result result = new Result();
        result.setCode(400);
        result.setMsg(msg);
        return result;
    }

    public static Result exception(Exception e){
        Result result = new Result();
        result.setCode(500);
        result.setMsg(e.getMessage());
        return result;
    }
}
