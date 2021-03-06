package org.sooo.factory;

import org.sooo.processor.CreditCardProcessor;
import org.sooo.processor.SquareCreditCardProcessor;

public class CreditCardProcessorFactory {

	private static CreditCardProcessor instance;

	public static void setInstance(CreditCardProcessor creditCardProcessor) {
		instance = creditCardProcessor;
	}

	public static CreditCardProcessor getInstance() {
		if (instance == null)
			return new SquareCreditCardProcessor();

		return instance;
	}
}
