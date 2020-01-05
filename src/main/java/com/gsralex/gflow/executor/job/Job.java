package com.gsralex.gflow.executor.job;

/**
 * @author gsralex
 * @version 2019-12-30
 */
public interface Job {

    void start();

    boolean isCanceled();

    boolean cancel();
}
