package com.qa.data;

//* Plain Java Object *
public class LoanAppInfo {

public LoanAppInfo (String loanAppUuid,Boolean skipSideEffects){
	this.loanAppUuid=loanAppUuid;
	this.skipSideEffects=skipSideEffects;
}


	String loanAppUuid ;
	Boolean skipSideEffects;

	public LoanAppInfo() {

	}
	
	//getters and setters methods:

	public String getLoanAppUuid() {
		return loanAppUuid;
	}

	public void setLoanAppUuid(String loanAppUuid) {
		this.loanAppUuid= loanAppUuid;
	}

	public Boolean getskipSideEffects() {
		return skipSideEffects;
	}

	public void setskipSideEffects(Boolean skipSideEffects) {
		this.skipSideEffects = skipSideEffects;
	}

	}

