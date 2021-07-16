package com.qa.data;

public class BorrowerResumptionInfo {
    public BorrowerResumptionInfo(){}
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMaskedEmail() {
        return maskedEmail;
    }

    public void setMaskedEmail(String maskedEmail) {
        this.maskedEmail = maskedEmail;
    }

    public boolean isSsnRequired() {
        return ssnRequired;
    }

    public void setSsnRequired(boolean ssnRequired) {
        this.ssnRequired = ssnRequired;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String firstName;
    String maskedEmail;
    boolean ssnRequired;
    String state;
    String email;


}
