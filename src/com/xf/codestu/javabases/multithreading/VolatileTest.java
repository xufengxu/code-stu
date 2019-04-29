package com.xf.codestu.javabases.multithreading;

/**
 * @author xuf  2019/04/29 16:04
 * @since 1.0.1
 *
 * volatile关键字理解
 *
 */
public class VolatileTest {

    int a = 0;
    int b = 0;

    public void set() {
        a = 1;
        b = 1;
    }

    public void loop() {
        while (b != 0) {
            if (a == 1) {
                System.out.println("i'm here");
            } else {
                System.out.println("what's wrong");
            }
        }
    }
}
