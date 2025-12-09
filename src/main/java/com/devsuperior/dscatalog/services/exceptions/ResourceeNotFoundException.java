package com.devsuperior.dscatalog.services.exceptions;

public class ResourceeNotFoundException extends RuntimeException {
    private static final long serialVersionUID =1L;

    public ResourceeNotFoundException(String msg) {
        super(msg);
    }

}
