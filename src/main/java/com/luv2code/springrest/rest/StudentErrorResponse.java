package com.luv2code.springrest.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Jack Tran
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StudentErrorResponse {

    private int status;
    private String message;
    private long timeStamp;


}
