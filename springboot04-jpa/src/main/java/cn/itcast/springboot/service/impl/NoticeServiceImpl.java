package cn.itcast.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.springboot.dao.NoticeDao;
import cn.itcast.springboot.entity.Notice;
import cn.itcast.springboot.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeDao noticeDao;
	
	@Override
	public List<Notice> findAll() {
		return noticeDao.findAll();
	}

}
