package com.practice.javaagent;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                System.out.println("app shutdown hook started...");
                System.out.println("app shutdown hook exit");
            }
        }));
        while (true) {
            Thread.sleep(1000);
            System.out.println("run");
        }
    }
}
