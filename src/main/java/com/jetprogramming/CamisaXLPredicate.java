package com.jetprogramming;

public class CamisaXLPredicate implements CamisaPredicate {

	@Override
	public boolean test(Camisa camisa) {
		return "XL".equals(camisa.getTalla());
	}

}
