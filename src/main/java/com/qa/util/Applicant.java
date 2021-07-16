package com.qa.util;

public class Applicant {

	String loanAppId ;
	String loanAppUuid ;
	String status;
	String productType;
	String sourceSystem;
	String desiredAmount;
	String borrowerResumptionInfo;
	String offers;
	String selectedOffer;
	String requiredAgreements;
	String resetOptions ;
	String originalLoanApp ;


	public Applicant(){
		
	}

	public Applicant(String loanAppId, String loanAppUuid, String status, String productType, String sourceSystem, String desiredAmount, String borrowerResumptionInfo, String offers, String selectedOffer, String requiredAgreements, String resetOptions, String originalLoanApp ) {
		this.loanAppId  = loanAppId ;
		this.loanAppUuid = loanAppUuid;
		this.status  = status;
		this.productType = productType;
		this.sourceSystem  = sourceSystem ;
		this.desiredAmount = desiredAmount;
		this.borrowerResumptionInfo  = borrowerResumptionInfo ;
		this.offers = offers;
		this.selectedOffer = selectedOffer;
		this.requiredAgreements  = requiredAgreements ;
		this.resetOptions = resetOptions;
		this.originalLoanApp =originalLoanApp;
	}



	public void setName(String loanAppId) {
		this.loanAppId = loanAppId;
	}


	public void setJob(String status) {
		this.status = status;
	}
	public void productType(String productType) {
		this.productType = productType;
	}
	public void sourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}
	public void desiredAmount(String desiredAmount) {
		this.desiredAmount = desiredAmount;
	}
	public void borrowerResumptionInfo(String borrowerResumptionInfo) {
		this.borrowerResumptionInfo = loanAppUuid;
	}


	public void offers(String sourceSystem) {
		this.offers = offers;
	}

	public void selectedOffer(String selectedOffer) {
		this.sourceSystem = selectedOffer;
	}

	public void requiredAgreements(String requiredAgreements) {
		this.requiredAgreements = requiredAgreements;
	}

	public void resetOptions(String resetOptions) {
		this.resetOptions = resetOptions;
	}

	public void originalLoanApp(String originalLoanApp) {
		this.originalLoanApp = originalLoanApp;
	}

}
