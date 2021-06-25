package Generics;



public class Gen<T> {

	private T t;

	public  Gen() {
	}

	public Gen(T t) {

		this.t = t;
	}

	public void set(T t) {

		this.t = t;
	}

	public T get() {

		return t;
	}
}