package com.irs.pojo;

public class TbTest {
    private Integer id;

    private String msg;

    private String awdawda;

    private String sdawdawd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    public String getAwdawda() {
        return awdawda;
    }

    public void setAwdawda(String awdawda) {
        this.awdawda = awdawda == null ? null : awdawda.trim();
    }

    public String getSdawdawd() {
        return sdawdawd;
    }

    public void setSdawdawd(String sdawdawd) {
        this.sdawdawd = sdawdawd == null ? null : sdawdawd.trim();
    }
}