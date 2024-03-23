package org.anonbook.anonbook.request;

public class AddPostRequest {
    private String title;
    private String imgName;
    private String time;

    public AddPostRequest(String title, String imgName, String time) {
        this.title = title;
        this.imgName = imgName;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
