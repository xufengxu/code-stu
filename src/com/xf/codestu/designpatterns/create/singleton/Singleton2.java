package com.xf.codestu.designpatterns.create.singleton;

/**
 * @author xuf  2019/04/29 15:43
 * @since 1.0.1
 *
 * 双重检查[推荐用]
 * 线程安全；延迟加载；效率较高。
 *
 * 缺点：第一次加载时会稍慢，jdk1.5之之前有可能会加载会失败。
 */
public class Singleton2 {

    private static Singleton2 singleton2;

    /**
     *
     * 1、线程间共享变量不可见性。
     * 2、无序性(执行顺序无法保证)。
     *
     * jdk5之前这样就可以保证每次都是从主内存中取,当然这样写或多或少的回影响性能，但是为了安全起见，这点性能牺牲还是值得。
     *
     */
    //private volatile static Singleton singleton2;

    private Singleton2(){

    }

    /**
     * 双重检查
     * 使用双重检查进一步做了优化，可以避免整个方法被锁，只对需要锁的代码部分加锁，可以提高执行效率。
     */
    public static Singleton2 getInstance() {
        if (singleton2 == null) {
            /**
             * 多个线程同时进来，第一个先持有锁，其他等待，第一check实例为null，创建实例，释放锁，后面线程获取锁check实例存在
             */
            synchronized (Singleton2.class) {
                if (singleton2 == null) {
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }
}
