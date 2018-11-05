package com.sema.cicek.impl;



import java.util.List;





import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sema.cicek.dao.CicekDao;
import com.sema.cicek.model.Cicek;

@Repository
public class CicekDaoImpl implements CicekDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void saveCicek(Cicek cicek) {
		getSession().merge(cicek);

	}

	@SuppressWarnings("unchecked")
	public List<Cicek> listCicek() {

		return getSession().createCriteria(Cicek.class).list();
	}

	public Cicek getCicek(Long id) {
		return (Cicek) getSession().get(Cicek.class, id);
	}

	public void deleteCicek(Long id) {

		Cicek cicek = getCicek(id);

		if (null != cicek) {
			getSession().delete(cicek);
		}

	}

	private Session getSession() {
		Session sess = getSessionFactory().getCurrentSession();
		if (sess == null) {
			sess = getSessionFactory().openSession();
		}
		return sess;
	}

	private SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
