package com.MyBlog.BlogApp.payload;

import java.util.Date;

public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String details;

    //Generate Constructor
    public ErrorDetails(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
//    public Date getTimestamp()
//    {
//        return timestamp;
//    }
}
