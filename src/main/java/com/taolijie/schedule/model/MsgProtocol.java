package com.taolijie.schedule.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 通讯协议
 * Created by whf on 9/30/15.
 */
public class MsgProtocol {
    /**
     * 消息的类型
     */
    private int type;

    /**
     * 接口调用地址
     */
    private String callbackPath;
    /**
     * 接口调用主机名
     */
    private String callbackHost;
    /**
     * 接口调用端口
     */
    private Integer callbackPort;

    /**
     * 调用方法
     */
    private String callbackMethod;

    /**
     * crontab表达式
     */
    private String cronExp;

    private Date exeAt;

    /**
     * 参数
     */
    private Map<String, String> parmMap;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCallbackPath() {
        return callbackPath;
    }

    public void setCallbackPath(String callbackPath) {
        this.callbackPath = callbackPath;
    }

    public String getCallbackHost() {
        return callbackHost;
    }

    public void setCallbackHost(String callbackHost) {
        this.callbackHost = callbackHost;
    }

    public Integer getCallbackPort() {
        return callbackPort;
    }

    public void setCallbackPort(Integer callbackPort) {
        this.callbackPort = callbackPort;
    }

    public String getCronExp() {
        return cronExp;
    }

    public void setCronExp(String cronExp) {
        this.cronExp = cronExp;
    }

    public Date getExeAt() {
        return exeAt;
    }

    public String getCallbackMethod() {
        return callbackMethod;
    }

    public void setCallbackMethod(String callbackMethod) {
        this.callbackMethod = callbackMethod;
    }

    public Map<String, String> getParmMap() {
        return parmMap;
    }

    public void setParmMap(Map<String, String> parmMap) {
        this.parmMap = parmMap;
    }

    public void setExeAt(Date exeAt) {
        this.exeAt = exeAt;
    }
}
