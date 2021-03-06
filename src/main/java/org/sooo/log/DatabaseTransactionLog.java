package org.sooo.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sooo.model.ChargeResult;

public class DatabaseTransactionLog implements TransactionLog {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void logChargeResult(ChargeResult chargeResult) {
		logger.info("logChargeResult(ChargeResult) called");
	}

	@Override
	public void logConnectException(Throwable t) {
		logger.info("logChargeResult(Throwable) called");
	}

}
