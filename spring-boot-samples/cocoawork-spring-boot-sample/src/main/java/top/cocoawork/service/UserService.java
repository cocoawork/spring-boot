package top.cocoawork.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.stereotype.Service;

public class UserService {
	private IndexService indexService;

	public IndexService getIndexService() {
		return indexService;
	}

	public void setIndexService(IndexService indexService) {
		this.indexService = indexService;
	}

	public UserService() {
		System.out.println("userService 初始化");
	}

}
