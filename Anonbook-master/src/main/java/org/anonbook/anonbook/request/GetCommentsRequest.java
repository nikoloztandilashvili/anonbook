package org.anonbook.anonbook.request;

public class GetCommentsRequest {
    private Integer postId;

    public GetCommentsRequest(Integer postId) {
        this.postId = postId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }
}
