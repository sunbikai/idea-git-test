package com.itheima;

import org.aspectj.lang.ProceedingJoinPoint;
import org.w3c.dom.ProcessingInstruction;

import java.util.Date;

public class upClass {
    public void checkPrivilege() {// 通知
        System.out.println("权限的校验...");
    }

    public void deleteTZ(Object object){
        System.out.println("删除成功..."+object);
    }

    public void afterThrowing(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println(new Date());
        proceedingJoinPoint.proceed();
        System.out.println(System.currentTimeMillis());
    }

    public void showExc(Exception e){
        System.out.println("异常通知"+e.getMessage());
    }
}
