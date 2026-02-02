package com.impact.lessons.services;

import  com.impact.lessons.constants.AppConstant;

public class HelloService {
    public HelloService(){
        AppConstant appConstants = new AppConstant();
    }
    public String sayHallo(){
        return AppConstant.HelloWorld;
    }

}