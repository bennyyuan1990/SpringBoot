package com.benny.springboot.web;

import com.benny.springboot.domain.ResponseBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice(basePackages = {"com.benny.springboot"})
public class ErrorAdvice   extends ResponseEntityExceptionHandler {


    @ExceptionHandler(value = {RuntimeException.class})
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseEntity<?> handleException(HttpServletRequest request,  Exception ex) {

        HttpStatus status = getStatus(request);
        return new ResponseEntity<>(new ResponseBean(status.value(), ex.getMessage(),null),status);
    }

    private HttpStatus getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return HttpStatus.valueOf(statusCode);
    }
}
