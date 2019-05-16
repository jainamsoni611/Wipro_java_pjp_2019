package packages.account;

import exception.NegativeValueException;

public class FDAccount extends Account {
	private int noOfDays;
	private int ageOfACHolder;
	
	@Override
	public double calculateInterest() {
		interestRate=0;
		if(amount<10000000){
			
			if(noOfDays>=7&&noOfDays<=14)
				interestRate=4.50;
			else if(noOfDays>=15&&noOfDays<=29)
				interestRate=4.75;
			else if(noOfDays>=30&&noOfDays<=45)
				interestRate=5.50;
			else if(noOfDays>=45&&noOfDays<=60)
				interestRate=7;
			else if(noOfDays>=61&&noOfDays<=184)
				interestRate=7.50;
			else if(noOfDays>=185&&noOfDays<=365)
				interestRate=8;
			
			//case of senior citizen
			if(ageOfACHolder>=65&&interestRate!=0) interestRate=interestRate+0.50;
			
		}else{
			if(noOfDays>=7&&noOfDays<=14)
				interestRate=6.50;
			else if(noOfDays>=15&&noOfDays<=29)
				interestRate=6.75;
			else if(noOfDays>=30&&noOfDays<=45)
				interestRate=6.75;
			else if(noOfDays>=45&&noOfDays<=60)
				interestRate=8;
			else if(noOfDays>=61&&noOfDays<=184)
				interestRate=8.50;
			else if(noOfDays>=185&&noOfDays<=365)
				interestRate=10;
			
		}
		
		
		return amount*interestRate/100;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) throws NegativeValueException {
		if(interestRate<0) throw new NegativeValueException(NegativeValueException.invalid_interestrate);
		this.interestRate = interestRate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) throws NegativeValueException {
		if(amount<0) throw new NegativeValueException(NegativeValueException.invalid_amount);
		this.amount = amount;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) throws NegativeValueException {
		if(noOfDays<0) throw new NegativeValueException(NegativeValueException.invalid_days);
		this.noOfDays = noOfDays;
	}

	public int getAgeOfACHolder() {
		return ageOfACHolder;
	}

	public void setAgeOfACHolder(int ageOfACHolder)throws NegativeValueException {
		if(ageOfACHolder<0) throw new NegativeValueException(NegativeValueException.invalid_age);
		this.ageOfACHolder = ageOfACHolder;
	}

}
