package org.anonbook.anonbook.request;

public class GetPostRequest {
    private Integer postId;

    public GetPostRequest(Integer postId) {
        this.postId = postId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }
}
