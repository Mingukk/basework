package com.example.protodemo.refletdemo;

import java.lang.reflect.Field;

public class FieldTest {
    //测试共有属性
    public void demo1() throws Exception{
        //获得Class
        Class class1 = Class.forName("com.example.protodemo.refletdemo.Animal");
        //获得属性:
        Field field = class1.getField("name");
        //操作属性:
        Animal animal = (Animal)class1.newInstance();
        field.set(animal,"老虎");// animal.name = "老虎";
        //获取值
        Object obj = field.get(animal);
        System.out.println(obj);
        System.out.println(animal);//这样会自动调用toString()方法
    }
    //测试私有方法
    public void demo2() throws Exception{
        //获得Class
        Class class1 = Class.forName("com.example.protodemo.refletdemo.Animal");
        //获得私有属性:
        Field field = class1.getDeclaredField("id");
        //操作属性:
        Animal animal = (Animal)class1.newInstance();
        //私有属性,需要设置一个可访问的权限
        field.setAccessible(true);
        field.set(animal,1);
        //获取值:
        Object obj = field.get(animal);
        System.out.println(obj);
        System.out.println(animal);
    }
    public static void main(String[] args) throws Exception {
        FieldTest fieldTest = new FieldTest();
        fieldTest.demo1();
        System.out.println("----------------");
        fieldTest.demo2();
    }
}
