package com.codingtest.hackerrank.advanced.JavaSingletonPattern;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Singleton singleton = Singleton.getSingleInstance();
        singleton.str = input;

        System.out.println("Hello I am a singleton! Let me say " + singleton.str + " to you");
    }
}

class Singleton {
    private static Singleton singleInstance = null;

    public String str;

    private Singleton() {}

    public static Singleton getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }
}