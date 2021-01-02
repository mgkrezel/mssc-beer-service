package com.mgkrezel.msscbeerservice.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class MvcExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<String>> validationErrorHandler(MethodArgumentNotValidException exception) {
        var fieldErrors = exception.getBindingResult().getFieldErrors();
        List<String> result = new ArrayList<>();
        fieldErrors.forEach(fieldError -> result.add(fieldError.getField() + " : " + fieldError.getDefaultMessage()));
        return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<String> notFoundErrorHandler(NotFoundException exception) {
        return new ResponseEntity<>("Not found beer with id: " + exception.getBeerId(), HttpStatus.BAD_REQUEST);
    }
}
