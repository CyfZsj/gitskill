package com.cyf.project01.handler;


import com.cyf.project01.util.JsonData;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 标记这个是一个异常处理类
 */
@RestControllerAdvice
//@ControllerAdvice
public class CustomExtHandler {

//
//    @ExceptionHandler(value = Exception.class)
//    JsonData handlerException(Exception e, HttpServletRequest request){
//
//        return JsonData.buildError("服务端出问题了", -2);
//    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    Object handlerException(Exception e, HttpServletRequest request){
        return JsonData.buildError("注册信息有误");
    }



}
