package com.example.anh.examplerecyclerview.data.model;

/**
 * Created by anh on 12/09/2017.
 */

public class User {
    private long mId;
    private String mUserName;
    private String avatarURL;

    public User() {
    }

    public User(long id, String userName, String avatarURL) {
        mId = id;
        mUserName = userName;
        this.avatarURL = avatarURL;
    }

    public long getId() {
        return mId;
    }

    public void setId(long id) {
        mId = id;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String userName) {
        mUserName = userName;
    }

    public String getAvatarURL() {
        return avatarURL;
    }

    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }
}