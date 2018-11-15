package com.live.orange.model.passport;

import java.util.Date;

public class User {
    private int uid;
    private String password;
    private String salt;
    private String nickname;
    private String nicknamemd5;
    private String avatar;
    private String signature;
    private String gender;
    private Date birth;
    private String loacation;
    private String verified;
    private String region;
    private Date addtime;
    private Date moditime;
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNicknamemd5() {
        return nicknamemd5;
    }

    public void setNicknamemd5(String nicknamemd5) {
        this.nicknamemd5 = nicknamemd5;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getLoacation() {
        return loacation;
    }

    public void setLoacation(String loacation) {
        this.loacation = loacation;
    }

    public String getVerified() {
        return verified;
    }

    public void setVerified(String verified) {
        this.verified = verified;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getModitime() {
        return moditime;
    }

    public void setModitime(Date moditime) {
        this.moditime = moditime;
    }

}
