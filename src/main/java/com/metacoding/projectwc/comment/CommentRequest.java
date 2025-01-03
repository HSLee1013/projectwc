package com.metacoding.projectwc.comment;

import com.metacoding.projectwc.user.User;
import com.metacoding.projectwc.worldcup.Worldcup;
import lombok.Data;

public class CommentRequest {

    @Data
    public static class PageDTO {
        private Integer page = 1; // 현재 페이지 번호
        private Integer size = 20;
    }

    @Data
    public static class SaveDTO {
        private String nickname;
        private String content;

        public Comment toEntity(User user, Worldcup worldcup, String winnername) {
            Comment comment = Comment.builder()
                    .nickname(nickname)
                    .content(content)
                    .winnername(winnername)
                    .user(user)
                    .worldcup(worldcup)
                    .build();
            return comment;
        }
    }
}
