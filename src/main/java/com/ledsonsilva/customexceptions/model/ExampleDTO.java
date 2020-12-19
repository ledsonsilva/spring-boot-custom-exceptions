package com.ledsonsilva.customexceptions.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ExampleDTO {
    @NotNull(message = "{required.validation}")
    private Long id;

    @NotBlank(message = "{required.validation}")
    @Size(min = 4, max = 30, message = "{size.validation}")
    private String name;

    public ExampleDTO() {
    }

    public ExampleDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
