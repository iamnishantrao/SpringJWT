package com.iamnishantrao.springjwt.models;

// output model for the authenticate process
public class AuthenticationResponse {

    private final String awt;

    public AuthenticationResponse(String awt) {
        this.awt = awt;
    }

    public String getAwt() {
        return awt;
    }
}
