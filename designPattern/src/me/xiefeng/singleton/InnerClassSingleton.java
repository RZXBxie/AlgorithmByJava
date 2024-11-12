package me.xiefeng.singleton;

public class InnerClassSingleton {
	private InnerClassSingleton() {}

	private static class InnerClassSingletonHolder {
		private static final InnerClassSingleton instance = new InnerClassSingleton();
	}

	public static InnerClassSingleton getInstance() {
		return InnerClassSingletonHolder.instance;
	}
}
