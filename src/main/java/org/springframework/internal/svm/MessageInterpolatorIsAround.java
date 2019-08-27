package org.springframework.internal.svm;

import java.util.function.BooleanSupplier;

public class MessageInterpolatorIsAround implements BooleanSupplier {

	@Override
	public boolean getAsBoolean() {
		try {
			return Class.forName("javax.validation.MessageInterpolator", false, getClass().getClassLoader()) != null;
		} catch (ClassNotFoundException e) {
			return false;
		}
	}

}
