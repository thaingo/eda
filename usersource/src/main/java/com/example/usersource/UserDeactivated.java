package com.example.usersource;

import java.time.Instant;

public class UserDeactivated implements DomainEvent {
    private final Instant occuredAt;

    public UserDeactivated(Instant occuredAt) {
        this.occuredAt = occuredAt;
    }

    @Override
    public Instant getOccuredAt() {
        return occuredAt;
    }
}
