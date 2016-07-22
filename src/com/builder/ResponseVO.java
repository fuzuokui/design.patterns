package com.builder;

import java.io.Serializable;

/**
 * @author 傅作魁（zuokuifu@creditease.cn）
 * @description
 * @since 2016/7/22 13:55
 */
public class ResponseVO implements Serializable {
    public static final int SUCCESS = 0;
    public static final int ERROR = 1;

    private int status;
    private String errorcode;
    private String errormsg;
    private String berrorcode;
    private String berrormsg;
    private Object data;

    public static class Success{
        private int status;
        private Object data;
        public Success( Object data){
            this.status = SUCCESS;
            this.data = data;
        }
        public ResponseVO build(){
            return new ResponseVO( this);
        }
    }

    public static class Fail{
        private int status;
        private String errorcode;
        private String errormsg;
        private String berrorcode;
        private String berrormsg;
        public Fail( String berrorcode, String berrormsg){
            this.status = ERROR;
            this.berrorcode = berrorcode;
            this.berrormsg = berrormsg;
        }
        public Fail setErrorcode( String errorcode){
            this.errorcode = errorcode;
            return this;
        }
        public Fail setErrormsg( String errormsg){
            this.errormsg = errormsg;
            return this;
        }
        public ResponseVO build(){
            return new ResponseVO(this);
        }
    }

    ResponseVO( Success success){
        this.status = success.status;
        this.data = success.data;
    }

    ResponseVO( Fail fail){
        this.status = fail.status;
        this.errorcode = fail.errorcode;
        this.errormsg = fail.errormsg;
        this.berrorcode = fail.berrorcode;
        this.berrormsg = fail.berrormsg;
    }

    public int getStatus() {
        return status;
    }

    public String getErrorcode() {
        return errorcode;
    }

    public String getErrormsg() {
        return errormsg;
    }

    public String getBerrorcode() {
        return berrorcode;
    }

    public String getBerrormsg() {
        return berrormsg;
    }

    public Object getData() {
        return data;
    }
}
