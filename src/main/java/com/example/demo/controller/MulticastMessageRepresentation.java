package com.example.demo.controller;

import java.util.List;

public class MulticastMessageRepresentation {
    
    private String data;
    private List<String> registrationTokens;
    /**
     * @return the message
     */
    public String getData() {
        return data;
    }
    /**
     * @param data the message to set
     */
    public void setData(String data) {
        this.data = data;
    }
    /**
     * @return the registrationTokens
     */
    public List<String> getRegistrationTokens() {
        return registrationTokens;
    }
    /**
     * @param registrationTokens the registrationTokens to set
     */
    public void setRegistrationTokens(List<String> registrationTokens) {
        this.registrationTokens = registrationTokens;
    }
}
