package com.jetprogramming;

public class CamisaRoja implements CamisaPredicate {

	@Override
	public boolean test(Camisa camisa) {
		return "ROJA".equals(camisa.getColor());
	}

}
