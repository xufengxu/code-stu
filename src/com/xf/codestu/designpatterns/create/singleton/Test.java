package com.xf.codestu.designpatterns.create.singleton;

import java.lang.reflect.Constructor;

/**
 * @author xuf  2019/04/29 15:10
 * @since 1.0.1
 */
public class Test {

    public static void main(String[] args) throws Exception {


        Singleton singleton = Singleton.getInstance();

        /**
         * 事实上，通过Java反射机制是能够实例化构造方法为private的类的，那基本上会使所有的Java单例实现失效。
         *
         * Class clazz = Singleton.class;
         * Constructor c0 = clazz.getDeclaredConstructor();
         * c0.setAccessible(true);
         * Singleton singleton1 = (Singleton)c0.newInstance();
         * System.out.println(singleton1);
         *
         */


    }

}
