package org.example;

public class WiseSaying {
    private int id;
    private String content;
    private  String authorName;

    public WiseSaying(int id, String content, String authorName) {
        this.id = id;
        this.content = content;
        this.authorName = authorName;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getAuthorName() {
        return authorName;
    }
}
