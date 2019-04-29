package com.xf.codestu.designpatterns.create.singleton;

/**
 * @author xuf  2019/04/29 14:59
 * @since 1.0.1
 *
 * 饿汉式（静态常量）[可用] 立即加载方式
 * 饿汉式（静态代码块）[可用]  立即加载方式
 *
 * 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 * 缺点：在类装载的时候就完成实例化，没有达到 懒加载 的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
 *
 */
public class Singleton {

    /**
     * 只能有一个实例
     */
    private final static Singleton INSTANCE = new Singleton();

    private static Singleton INSTANCE1;
    static {
        INSTANCE1 = new Singleton();
    }

    /**
     * 必须自行创建这个实例,Singleton通过将构造方法限定为private避免了类在外部被实例化
     */
    private Singleton(){

    }

    /**
     * 自行向整个系统提供这个实例,提供实例获取方法
     * @return INSTANCE
     */
    public static Singleton getInstance(){
        return INSTANCE;
    }

    /**
     * 自行向整个系统提供这个实例,提供实例获取方法
     * @return INSTANCE1
     */
    public static Singleton getInstance1(){
        return INSTANCE1;
    }

}
