package com.ledsonsilva.customexceptions.exception.dto;

public class ErrorDTO {
    private String key;
    private String message;

    public ErrorDTO() {
    }

    public ErrorDTO(String key, String message) {
        this.key = key;
        this.message = message;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
