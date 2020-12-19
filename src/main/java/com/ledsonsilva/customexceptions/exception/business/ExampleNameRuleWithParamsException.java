package com.ledsonsilva.customexceptions.exception.business;

import com.ledsonsilva.customexceptions.exception.BaseRuntimeException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Map;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ExampleNameRuleWithParamsException extends BaseRuntimeException {
    private static final String KEY = "example.name.rule.with.params";

    public ExampleNameRuleWithParamsException(String value) {
        super(Map.of("value", value));
    }

    @Override
    public String getExceptionKey() {
        return KEY;
    }
}
