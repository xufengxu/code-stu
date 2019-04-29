package com.xf.codestu.designpatterns.create.singleton;

/**
 * @author xuf  2019/04/29 15:27
 * @since 1.0.1
 *
 * 懒汉式(线程不安全)[不可用]
 * 懒汉式(线程安全，同步方法)[不推荐用]
 * 懒汉式(线程安全，同步代码块)[不可用]
 *
 */
public class Singleton1 {

    private static Singleton1 singleton1;

    private Singleton1(){

    }

    /**
     * 这种写法起到了Lazy Loading的效果，但是只能在单线程下使用。如果在多线程下，一个线程进入了if (singleton == null)判断语句块，
     * 还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。所以在多线程环境下不可使用这种方式。
     * @return singleton2
     */
    public static Singleton1 getInstance(){
        if (singleton1 == null){
            singleton1 = new Singleton1();
        }
        return singleton1;
    }

    /**
     * 解决上面实现方式的线程不安全问题，做个线程同步就可以了，于是就对getInstance()方法进行了线程同步。
     * 缺点：效率太低了，每个线程在想获得类的实例时候，执行getInstance2()方法都要进行同步。
     *      而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接return就行了。方法进行同步效率太低要改进。
     * @return singleton1
     */
    public static synchronized Singleton1 getInstance1() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }

    /**
     * 由于第四种实现方式同步效率太低，所以摒弃同步方法，改为同步产生实例化的的代码块。
     * 但是这种同步并不能起到线程同步的作用。跟第1种实现方式遇到的情形一致，
     * 假如一个线程进入了if (singleton == null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。
     * @return singleton1
     */
    public static Singleton1 getInstance2() {
        if (singleton1 == null) {
            synchronized (Singleton.class) {
                singleton1 = new Singleton1();
            }
        }
        return singleton1;
    }

}
