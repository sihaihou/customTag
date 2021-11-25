package com.reyco.tag.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.reyco.tag.core.TagApplication;
import com.reyco.tag.core.service.TestService;

/** 
 * @author  reyco
 * @date    2021.11.24
 * @version v1.0.1 
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=TagApplication.class)
public class CustomTagApplicationTest {
	
	@Autowired
	public TestService testService;
	
	@Test
	public void test() {
		testService.test();
	}
	
}
