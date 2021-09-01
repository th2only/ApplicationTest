package com.green.biz;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchMaxTest {

	@Test
	public void test() {
		int[] test01 = {1, 3, 4, 2};
	      int[] test02 = {-12, -1, -3, -4, -2};
	      
	      assertEquals(4, CalcUtil.searchMax(test01));
	      assertEquals(-1, CalcUtil.searchMax(test02));
	}

}
