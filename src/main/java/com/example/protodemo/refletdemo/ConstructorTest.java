package com.example.protodemo.refletdemo;

import java.lang.reflect.Constructor;

public class ConstructorTest {
    /**
     *获得无参构造方法
     */
    public void demo1() throws Exception {
        //获得类的字节码文件对应的对象:
        Class class1 = Class.forName("com.example.protodemo.refletdemo.Animal");
        Constructor c = class1.getConstructor();
        Animal animal = (Animal)c.newInstance();//相当于 Animal animal = new Animal();
    }
    /**
     *获得有参构造方法
     */
    public void demo2() throws Exception{
        Class class1 = Class.forName("com.example.protodemo.refletdemo.Animal");
        Constructor c = class1.getConstructor(int.class,String.class);
        Animal animal = (Animal)c.newInstance(2,"猴子");//相当于 Animal animal = new Animal(2,"猴子");
        System.out.println(animal.toString());
    }
    public static void main(String[] args) throws Exception {
        ConstructorTest c = new ConstructorTest();
        c.demo1();
        System.out.println("------------");
        c.demo2();
    }
}
