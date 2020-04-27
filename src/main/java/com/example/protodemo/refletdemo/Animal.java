package com.example.protodemo.refletdemo;

public class Animal {
    public String name;
    private int id;
    public Animal(){
        System.out.println("我是无参构造方法");
    }
    public Animal(int id,String name){
        this.setId(id);
        this.setName(name);
        System.out.println("我是有参构造方法");
    }
    public void eat(){
        System.out.println("我是公有方法");
    }
    private void drink(){
        System.out.println("我是私有方法");
    }
    private void play(String name,String sex){
        System.out.println("我是私有带参方法");
    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
