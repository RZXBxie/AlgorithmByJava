package me.xiefeng.singleton;

/*  双重检查锁定实现单例模式
	要点：instance必须使用volatile关键字修饰
 */

public class DoubleCheckedLockingSingleton {
	private static volatile DoubleCheckedLockingSingleton instance;
	private DoubleCheckedLockingSingleton() {}

	public static DoubleCheckedLockingSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckedLockingSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckedLockingSingleton();
				}
			}
		}
		return instance;
	}
}
