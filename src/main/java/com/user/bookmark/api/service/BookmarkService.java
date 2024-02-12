package com.user.bookmark.api.service;

import com.user.bookmark.api.controller.BookmarkRequest;
import com.user.bookmark.api.controller.BookmarkResponse;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BookmarkService {

    public BookmarkResponse storeBookmark(BookmarkRequest bookmarkRequest){
        return BookmarkResponse.builder()
                .bookmarkUUID(UUID.randomUUID())
                .bookmarkName(bookmarkRequest.getBookmarkName())
                .build();
    }

    public BookmarkResponse getBookmark(UUID bookmarkUUID) {
        return BookmarkResponse.builder()
                .bookmarkUUID(bookmarkUUID)
                .bookmarkName("Google")
                .bookmarkURLString("https://www.google.com")
                .build();
    }
}
