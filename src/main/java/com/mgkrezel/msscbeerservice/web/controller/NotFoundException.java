package com.mgkrezel.msscbeerservice.web.controller;

import java.util.UUID;

public class NotFoundException extends RuntimeException {
    private final UUID beerId;

    public NotFoundException(UUID beerId) {
        this.beerId = beerId;
    }

    public UUID getBeerId() {
        return beerId;
    }
}
