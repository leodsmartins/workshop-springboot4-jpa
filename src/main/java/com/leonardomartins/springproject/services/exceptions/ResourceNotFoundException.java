package com.leonardomartins.springproject.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Object id) {
        super("Resource id: " +  id + " not found");
    }
}
