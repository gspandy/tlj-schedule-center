package com.taolijie.schedule.constant;

/**
 * Created by whf on 9/30/15.
 */
public enum MsgType {
    /**
     * cron表达式风格
     */
    CRON_STYLE(0),
    /**
     * 指定日期执行
     */
    DATE_STYLE(1);

    private int code;

    private MsgType(int code) {
        this.code = code;
    }

    public static MsgType fromCode(int code) {
        switch (code) {
            case 0:
                return CRON_STYLE;

            case 1:
                return DATE_STYLE;

            default:
                return null;
        }
    }
}
