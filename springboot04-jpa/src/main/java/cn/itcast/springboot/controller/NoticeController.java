package cn.itcast.springboot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.itcast.springboot.entity.Notice;
import cn.itcast.springboot.service.NoticeService;

@RestController
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	/**
	 * 查询所有公告
	 * @param model
	 * @return
	 */
	@GetMapping("/findAll")
	public List<Notice> findAll(Model model){
		return noticeService.findAll();
	}
}
