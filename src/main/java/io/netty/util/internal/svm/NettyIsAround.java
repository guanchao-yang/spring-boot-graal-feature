package io.netty.util.internal.svm;

import java.util.function.BooleanSupplier;

public class NettyIsAround implements BooleanSupplier {

	@Override
	public boolean getAsBoolean() {
		try {
			return Class.forName("io.netty.util.internal.CleanerJava6", false, getClass().getClassLoader()) != null;
		} catch (ClassNotFoundException e) {
			return false;
		}
	}

}
