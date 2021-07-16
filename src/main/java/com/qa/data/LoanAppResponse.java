package com.qa.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoanAppResponse {
    public LoanAppResumptionInfo getLoanAppResumptionInfo() {
        return loanAppResumptionInfo;
    }

    public void setLoanAppResumptionInfo(LoanAppResumptionInfo loanAppResumptionInfo) {
        this.loanAppResumptionInfo = loanAppResumptionInfo;
    }

    public String getSelectedOffer() {
        return selectedOffer;
    }

    public void setSelectedOffer(String selectedOffer) {
        this.selectedOffer = selectedOffer;
    }

    public List<String> getRequiredAgreements() {
        return requiredAgreements;
    }

    public void setRequiredAgreements(List<String> requiredAgreements) {
        this.requiredAgreements = requiredAgreements;
    }

    public List<String> getResetOptions() {
        return resetOptions;
    }

    public void setResetOptions(List<String> resetOptions) {
        this.resetOptions = resetOptions;
    }

    public String getOriginalLoanApp() {
        return originalLoanApp;
    }

    public void setOriginalLoanApp(String originalLoanApp) {
        this.originalLoanApp = originalLoanApp;
    }

    public List<String> getOffers() {
        return offers;
    }

    public void setOffers(List<String> offers) {
        this.offers = offers;
    }

    LoanAppResumptionInfo loanAppResumptionInfo;
     String selectedOffer;
     List<String> requiredAgreements;
     List<String> resetOptions= Arrays.asList("LEAD_SECRET","WIPE","DEACTIVATE_USER");
     String originalLoanApp;
     List<String> offers;

     public LoanAppResponse() {}
}

