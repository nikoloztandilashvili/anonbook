package org.anonbook.anonbook.response;

public class GetPostResponse {
    private Integer id;
    private String title;
    private String imgName;
    private String time;

    public GetPostResponse(Integer id, String title, String imgName, String time) {
        this.id = id;
        this.title = title;
        this.imgName = imgName;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
