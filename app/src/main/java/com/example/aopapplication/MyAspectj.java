package com.example.aopapplication;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspectj {

    @Before("execution(* com.example.aopapplication.MainActivity.clickButton(..))")
    public void cutFun(JoinPoint joinPoint){
        Log.i("aspectj", "get pointCut ============================");
    }
}
