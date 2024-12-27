package com.ocean.springbootstart.listeners;

import com.ocean.springbootstart.validation.ValidUserName;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class User {
    @NotEmpty
    @ValidUserName
    private String name;

    public User(String name) {
        this.name = name;
    }


}
