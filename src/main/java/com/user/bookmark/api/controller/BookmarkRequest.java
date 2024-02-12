package com.user.bookmark.api.controller;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class BookmarkRequest {
    @NotNull(message = "Bookmark Name may not be null")
    public String bookmarkName ;
    public String bookmarkDescription;
    @NotNull(message = "Bookmark URL may not be null")
    public String bookmarkURLString;

}
