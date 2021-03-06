package fxionSecurity;

abstract class SecurityFactor {
	
	boolean greenlight;
	
	public SecurityFactor(){
		greenlight = false;
	}
	
	public boolean accepted(){		//Method for factors which have verified access
		return greenlight;
	}
	
	public void reset(){			//set factor to an unverified status
		greenlight = false;
	}
	
	private void accept(){
		greenlight = true;
	}
	
	private void reject() throws FactorException{
		reset();
		throw new FactorException();
	}
}