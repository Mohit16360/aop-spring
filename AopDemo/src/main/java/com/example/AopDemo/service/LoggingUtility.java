package com.example.AopDemo.service;

public class LoggingUtility {

    public static void logstart(String className, String methodName) {
        System.out.println("Logging -> className " + className +"method name " + methodName);
    }
    public static void logend(String className, String methodName) {
        System.out.println("Logging -> className " + className +"method name " + methodName);
    }
}
