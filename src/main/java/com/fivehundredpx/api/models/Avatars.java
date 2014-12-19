package com.fivehundredpx.api.models;

import com.google.gson.annotations.SerializedName;

public class Avatars {

    @SerializedName("default")
    public UrlList defaultSize;
    public UrlList large;
    public UrlList small;
    public UrlList tiny;

    public static class UrlList {

        public String http;
        public String https;

    }
}
