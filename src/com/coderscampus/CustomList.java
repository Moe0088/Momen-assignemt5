package com.coderscampus;

public interface CustomList<T> {

	boolean add(T item);

	int getSize();

	T get(int index);
}
