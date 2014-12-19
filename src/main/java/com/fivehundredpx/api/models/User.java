package com.fivehundredpx.api.models;

import java.util.Date;

public class User {

    public int id;
    public String username;
    public String firstname;
    public String lastname;
    public String birthday;
    public int sex;
    public String city;
    public String state;
    public String country;
    public Date registration_date;
    public String about;
    public int usertype;
    public String domain;
    public boolean fotomoto_on;
    public String locale;
    public boolean show_nude;
    public int allow_sale_requests;
    public String fullname;
    public String userpic_url;
    public String userpic_https_url;
    public int upgrade_status;
    public boolean store_on;
    public int photos_count;
    public int affection;
    public int in_favorites_count;
    public int friends_count;
    public int followers_count;
    public String analytics_code;
    public boolean invite_pending;
    public boolean invite_accepted;
    public String email;
    public int upload_limit;
    public Date upload_limit_expiry;
    public int upgrade_type;
    public Date upgrade_status_expiry;
    public Auth auth;
    public boolean presubmit_for_licensing;
    public Contacts contacts;
    public Equipment equipment;
    public Avatars avatars;

}
