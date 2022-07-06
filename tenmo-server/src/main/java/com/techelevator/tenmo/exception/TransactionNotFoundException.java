package com.techelevator.tenmo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Transaction not found")
public class TransactionNotFoundException extends Exception {
    private static final long serialVersionUID =1L;

    public TransactionNotFoundException() {
        super("Transaction Not Found");
    }
}
