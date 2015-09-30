package com.taolijie.schedule.exception;

/**
 * Created by whf on 9/30/15.
 */
public class BaseCheckedException extends Exception {
    /**
     * 重写此方法提高异常性能
     * @return
     */
    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
