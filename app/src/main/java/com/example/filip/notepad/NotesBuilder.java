package com.example.filip.notepad;

/**
 * Created by filip on 26.2.18.
 */

public class NotesBuilder {
    private String title,
            content;

    public NotesBuilder() {
    }

    public NotesBuilder(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
