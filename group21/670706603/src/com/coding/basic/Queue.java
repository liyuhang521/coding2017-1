package com.coding.basic;

import java.util.Arrays;


public class Queue {
	private Object[] elementData = new Object[1];
	private int size = 0;

	public void enQueue(Object o) {
		if (size < elementData.length) {
			elementData[size] = o;
			size++;
		}else{
			elementData=growarray(elementData);
			elementData[size] = o;
			size++;
		}
	}

	public Object deQueue() {
		if(size>0){
			Object o=elementData[0];
			for(int i=1;i<size;i++){
				elementData[i-1]=elementData[i];
			}
			size--;
			return o;
		}else{
			return null;
		}
		
	}

	public boolean isEmpty() {
		if (elementData.length == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int size() {
		return size;
	}

	/**
	 * 数组宽度增长方法
	 */
	private Object[] growarray(Object[] array) {

		return Arrays.copyOf(array, array.length + 1);

	}
}
