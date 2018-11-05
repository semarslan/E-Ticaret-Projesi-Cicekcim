package com.sema.cicek.dao;

import java.util.List;

import com.sema.cicek.model.Cicek;


public interface CicekDao {

	/*
	 * CREATE and UPDATE
	 */
	public void saveCicek(Cicek cicek); // create and update

	/*
	 * READ
	 */
	public List<Cicek> listCicek();
	public Cicek getCicek(Long id);

	/*
	 * DELETE
	 */
	public void deleteCicek(Long id);
}
