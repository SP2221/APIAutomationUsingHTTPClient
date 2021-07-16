package com.qa.data;

import java.util.List;

public class LoanAppResumptionInfo {

    public LoanAppResumptionInfo(){}
    public int getLoanAppId() {
        return loanAppId;
    }

    public void setLoanAppId(int loanAppId) {
        this.loanAppId = loanAppId;
    }

    public String getLoanAppUuid() {
        return loanAppUuid;
    }

    public void setLoanAppUuid(String loanAppUuid) {
        this.loanAppUuid = loanAppUuid;
    }

    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public double getDesiredAmount() {
        return desiredAmount;
    }

    public void setDesiredAmount(double desiredAmount) {
        this.desiredAmount = desiredAmount;
    }

    public BorrowerResumptionInfo getBorrowerResumptionInfo() {
        return borrowerResumptionInfo;
    }

    public void setBorrowerResumptionInfo(BorrowerResumptionInfo borrowerResumptionInfo) {
        this.borrowerResumptionInfo = borrowerResumptionInfo;
    }

    public BorrowerResumptionInfo getCoBorrowerResumptionInfo() {
        return coBorrowerResumptionInfo;
    }

    public void setCoBorrowerResumptionInfo(BorrowerResumptionInfo coBorrowerResumptionInfo) {
        this.coBorrowerResumptionInfo = coBorrowerResumptionInfo;
    }

    public Boolean getTurnDown() {
        return turnDown;
    }

    public void setTurnDown(Boolean turnDown) {
        this.turnDown = turnDown;
    }

    public Boolean getHasLogin() {
        return hasLogin;
    }

    public void setHasLogin(Boolean hasLogin) {
        this.hasLogin = hasLogin;
    }

    public List<String> getAvailableAppImprovements() {
        return availableAppImprovements;
    }

    public void setAvailableAppImprovements(List<String> availableAppImprovements) {
        this.availableAppImprovements = availableAppImprovements;
    }

    public Double getCashOutAmount() {
        return cashOutAmount;
    }

    public void setCashOutAmount(Double cashOutAmount) {
        this.cashOutAmount = cashOutAmount;
    }

    public Boolean getCanAddCollateral() {
        return canAddCollateral;
    }

    public void setCanAddCollateral(Boolean canAddCollateral) {
        this.canAddCollateral = canAddCollateral;
    }

    public int getRewardProgramId() {
        return rewardProgramId;
    }

    public void setRewardProgramId(int rewardProgramId) {
        this.rewardProgramId = rewardProgramId;
    }

    public String getRewardProgramCode() {
        return rewardProgramCode;
    }

    public void setRewardProgramCode(String rewardProgramCode) {
        this.rewardProgramCode = rewardProgramCode;
    }

    public String getAddon() {
        return addon;
    }

    public void setAddon(String addon) {
        this.addon = addon;
    }

    public String getIsMobileDiscountApplied() {
        return isMobileDiscountApplied;
    }

    public void setIsMobileDiscountApplied(String isMobileDiscountApplied) {
        this.isMobileDiscountApplied = isMobileDiscountApplied;
    }

    public Boolean getCheckingDiscountAvailable() {
        return checkingDiscountAvailable;
    }

    public void setCheckingDiscountAvailable(Boolean checkingDiscountAvailable) {
        this.checkingDiscountAvailable = checkingDiscountAvailable;
    }

    int loanAppId;
    String loanAppUuid;
    String referrer;
    String status;
    String productType;
    String sourceSystem;
    double desiredAmount;
    BorrowerResumptionInfo borrowerResumptionInfo;
    BorrowerResumptionInfo coBorrowerResumptionInfo;
    Boolean turnDown;
    Boolean hasLogin;
    List<String> availableAppImprovements;
    Double cashOutAmount;
    Boolean canAddCollateral;
    int rewardProgramId;
    String rewardProgramCode;
    String addon;
    String isMobileDiscountApplied;
    Boolean checkingDiscountAvailable;
}

