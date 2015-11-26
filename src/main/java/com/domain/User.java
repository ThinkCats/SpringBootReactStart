package com.domain;

import lombok.Data;

/**
 * Created by Wanglei on 15/11/26.
 */
@Data
public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
}
