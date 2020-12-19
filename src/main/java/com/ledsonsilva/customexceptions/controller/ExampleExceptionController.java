package com.ledsonsilva.customexceptions.controller;

import com.ledsonsilva.customexceptions.exception.business.ExampleNameRuleException;
import com.ledsonsilva.customexceptions.exception.business.ExampleNameRuleWithParamsException;
import com.ledsonsilva.customexceptions.model.ExampleDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "custom-exception-example")
public class ExampleExceptionController {
    @PostMapping(path = "validation")
    public ResponseEntity<ExampleDTO> exampleModelValidationEndpoint(@Validated @RequestBody ExampleDTO dto) {
        return ResponseEntity.ok(dto);
    }

    @PostMapping(path = "business")
    public ResponseEntity<String> exampleBusinessValidationEndpoint(@Validated @RequestBody ExampleDTO dto) {
        if (dto.getName().equalsIgnoreCase("params")) {
            throw new ExampleNameRuleWithParamsException("params");
        }

        if (!dto.getName().equalsIgnoreCase("business")) {
            throw new ExampleNameRuleException();
        }
        return ResponseEntity.ok("Success!");
    }
}
