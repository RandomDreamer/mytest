package cn.itcast.springboot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import cn.itcast.springboot.Application;
import cn.itcast.springboot.service.NoticeService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class SpringBootDemoTest {

	@Autowired
	private NoticeService noticeService;
	
	@Test
	public void test(){
		System.out.println(noticeService.findAll());
	}
}
