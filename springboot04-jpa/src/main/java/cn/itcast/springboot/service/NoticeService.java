package cn.itcast.springboot.service;

import java.util.List;

import cn.itcast.springboot.entity.Notice;

public interface NoticeService {

	public List<Notice> findAll();
}
