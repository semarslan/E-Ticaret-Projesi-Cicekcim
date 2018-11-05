package com.sema.cicek.service.impl;

import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sema.cicek.dao.CicekDao;
import com.sema.cicek.model.Cicek;
import com.sema.cicek.service.CicekService;

@Service
public class CicekServiceImpl implements CicekService {

	@Autowired
	private CicekDao cicekDao;

	@Transactional
	public void saveCicek(Cicek cicek) {
		cicekDao.saveCicek(cicek);
	}

	@Transactional(readOnly = true)
	public List<Cicek> listCicek() {
		return cicekDao.listCicek();
	}

	@Transactional(readOnly = true)
	public Cicek getCicek(Long id) {
		return cicekDao.getCicek(id);
	}

	@Transactional
	public void deleteCicek(Long id) {
		cicekDao.deleteCicek(id);

	}

}
