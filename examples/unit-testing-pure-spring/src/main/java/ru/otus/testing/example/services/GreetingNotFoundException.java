package ru.otus.testing.example.services;

public class GreetingNotFoundException extends RuntimeException {
    public GreetingNotFoundException(String countryCode) {
        super(String.format("No greeting was found for country code %s", countryCode));

    }
}
