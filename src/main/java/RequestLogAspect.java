package main.java;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by admin on 2019/6/13.
 */

@Aspect
@Component
public class RequestLogAspect {
    private static final Logger logger = LoggerFactory.getLogger(RequestLogAspect.class);

    @Pointcut("execution(* Hello())")
    public void webLog() {}

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        logger.info("IP:" + request.getRemoteAddr());
        System.out.println("AAA" +  request.getRemoteAddr());

    }


}
