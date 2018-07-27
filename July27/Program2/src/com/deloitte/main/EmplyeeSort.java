package com.deloitte.main;

import java.util.Comparator;

public class EmplyeeSort implements Comparator<EmplyeeVo> {

	public EmplyeeSort() {

	}

	@Override
	public int compare(EmplyeeVo e1, EmplyeeVo e2) {

		return (int) (e1.getIncometax() - e2.getIncometax());
	}

	
}
