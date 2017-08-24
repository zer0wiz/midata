package com.nkia.cygnus.midata;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
@Controller
public class MiDataApplicationTests {
	@Test
	public void contextLoads() throws Exception {
		try {
			log.info("Test");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
