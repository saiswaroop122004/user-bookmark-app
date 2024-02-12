package com.user.bookmark.api.controller;

import com.user.bookmark.api.service.BookmarkService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/bookmark")
@AllArgsConstructor
public class BookmarkAPIController {

    private BookmarkService bookmarkService;
    @PostMapping("/")
    public ResponseEntity<BookmarkResponse> postBookmark(@RequestBody BookmarkRequest bookmarkRequest){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(bookmarkService.storeBookmark(bookmarkRequest));
    }

    @GetMapping("/{bookmarkUUID}")
    public ResponseEntity<BookmarkResponse> getBookmark(@PathVariable UUID bookmarkUUID){
        return ResponseEntity.status(HttpStatus.OK).body(bookmarkService.getBookmark(bookmarkUUID));
    }
}
