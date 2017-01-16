package com.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Title:JunitTest
 * Description:单元测试  :  测试的方法不能带有参数
 * Company:
 * @author 
 * @date 2016年12月16日
 * 
 */
public class JunitTest {
	
	@After
	public void method(){
		System.out.println("test----------");
	}
	
	@Test
	public void method2(){
		System.out.println("test2----------");
	}
	
	@Before
	public void method3(){
		
		System.out.println("test3----------");
	}

}
