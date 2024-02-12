package com.user.bookmark.api.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
public class BookmarkResponse {
    public UUID bookmarkUUID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String bookmarkName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String bookmarkURLString;
}
