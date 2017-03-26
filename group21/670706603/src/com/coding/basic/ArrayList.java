package com.coding.basic;

import java.util.Arrays;

public class ArrayList implements List {

	private int size = 0;

	private Object[] elementData = new Object[1];

	/**
	 * 数组顺序添加元素方法
	 */
	public void add(Object o) {
		if (elementData.length > size) {
			elementData[size] = o;
			size++;
		} else {
			elementData = growarray(elementData);
			elementData[size] = o;
			size++;
		}

	}

	/**
	 * 数组指定位置插入元素方法
	 */
	public void add(int index, Object o) {

	}

	/**
	 * 获取指定位置的元素
	 */
	public Object get(int index) {
		if (index < elementData.length) {
			return elementData[index];
		} else {
			return -1;
		}
	}

	public Object remove(int index) {
		if (index < elementData.length){
			Object[] elementData1 = new Object[1];
			elementData1=Arrays.copyOfRange(elementData, 0, index);
			for(int i=index;i<elementData.length;i++){
			}
		}
		return null;
	}

	public int size() {
		return elementData.length;
	}

	public Iterator iterator() {
		return null;
	}

	/**
	 * 数组宽度增长方法
	 */
	private Object[] growarray(Object[] array) {
		
		return Arrays.copyOf(array, array.length+1);

	}

}
