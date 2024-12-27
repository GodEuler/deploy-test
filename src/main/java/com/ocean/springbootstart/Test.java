package com.ocean.springbootstart;

import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.WebApplicationType;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;
import java.util.function.BiFunction;

public class Test {

    public static class Student{
        private String name;
        private int age;

        public Student(String name, int age) {
            System.out.println("有参构造");
            this.name = name;
            this.age = age;
        }

        public Student() {
            System.out.println("无参构造");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
