package com.ocean.springbootstart.validation;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

@ControllerAdvice
public class ControllerAdvices {


    @ExceptionHandler
    public ResponseEntity<String> handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
        BindingResult bindingResult = e.getBindingResult();
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        String firstMsg = "";
        for (FieldError fieldError : fieldErrors) {
            System.out.println("fieldError.getDefaultMessage() = " + fieldError.getDefaultMessage());
            firstMsg = fieldError.getDefaultMessage();
        }

        ResponseEntity<String> stringResponseEntity = new ResponseEntity<String>(firstMsg,HttpStatus.BAD_REQUEST);
        return stringResponseEntity;
    }
}
