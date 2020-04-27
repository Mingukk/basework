package com.example.protodemo.refletdemo;

import java.lang.reflect.Method;

public class MethodTest {
    //测试公有方法
    public void demo1() throws Exception{
        //获取Class对象
        Class class1 = Class.forName("com.example.protodemo.refletdemo.Animal");
        //实例化
        Animal animal = (Animal)class1.newInstance();
        //获得公有方法
        Method method = class1.getMethod("eat");
        //执行该方法
        method.invoke(animal);// 相当于animal.eat();
    }
    //测试私有方法
    public void demo2() throws Exception{
        //获取Class对象
        Class class1 = Class.forName("com.example.protodemo.refletdemo.Animal");
        //实例化
        Animal animal = (Animal)class1.newInstance();
        //获得私有方法
        Method method = class1.getDeclaredMethod("drink");
        //设置私有的访问权限
        method.setAccessible(true);
        //执行该方法
        method.invoke(animal);//相当于animal.drink();
    }
    public void demo3() throws Exception{
        //获取Class对象
        Class class1 = Class.forName("JavaReflectTest.Animal");
        //实例化
        Animal animal = (Animal)class1.newInstance();
        //获得私有带参的方法
        Method method = class1.getDeclaredMethod("play", int.class, String.class);
        //设置私有的访问权限
        method.setAccessible(true);
        //执行该方法
        Object obj = method.invoke(animal,2,"孔雀"); // 这是有返回值的情况 如果没有返回值可以直接写method.invoke(animal,2,"孔雀");
        System.out.println(obj);//打印返回的东西,没有就是null
    }
    //测试私有带参数的方法
    public static void main(String[] args) throws Exception{
        MethodTest methodTest = new MethodTest();
        methodTest.demo1();
        System.out.println("--------------------");
        methodTest.demo2();
        System.out.println("--------------------");
        methodTest.demo3();
    }
}
