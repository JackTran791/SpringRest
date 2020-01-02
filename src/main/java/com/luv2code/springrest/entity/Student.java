package com.luv2code.springrest.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Jack Tran
 */

@Getter
@Setter
public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private boolean active;
}
