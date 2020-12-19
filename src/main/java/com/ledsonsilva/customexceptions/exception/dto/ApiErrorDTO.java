package com.ledsonsilva.customexceptions.exception.dto;

import java.util.Date;
import java.util.Set;

public class ApiErrorDTO {
    private Date timestamp;
    private Integer status;
    private String code;
    private Set<ErrorDTO> errors;

    public ApiErrorDTO() {
    }

    public ApiErrorDTO(Date timestamp, Integer status, String code, Set<ErrorDTO> errors) {
        this.timestamp = timestamp;
        this.status = status;
        this.code = code;
        this.errors = errors;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Set<ErrorDTO> getErrors() {
        return errors;
    }

    public void setErrors(Set<ErrorDTO> errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "ApiErrorDto{" +
                "timestamp=" + timestamp +
                ", status=" + status +
                ", code='" + code + '\'' +
                ", errors=" + errors +
                '}';
    }
}


