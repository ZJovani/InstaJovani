package com.example.instajovani.Model;

public class User {

    private String id;
    private String usersname;
    private String fullname;
    private String imageurl;
    private String bio;

    public User(String id, String usersname, String fullname, String imageurl, String bio) {
        this.id = id;
        this.usersname = usersname;
        this.fullname = fullname;
        this.imageurl = imageurl;
        this.bio = bio;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsersname() {
        return usersname;
    }

    public void setUsersname(String usersname) {
        this.usersname = usersname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}


