package com.example.clientv10.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class UserDTO {

    private Long id;
    @NotEmpty
    private String name;

    private Long itn;
    private String username;



}
