package com.practice.javaagent;

import java.lang.instrument.Instrumentation;

/**
 * @author Luo Bao Ding
 * @since 2019/1/14
 */
public class Agent {
    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("Agent.premain");
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("agent shutdown started...");
            System.out.println("agent shutdown exit");
        }));
    }

}
