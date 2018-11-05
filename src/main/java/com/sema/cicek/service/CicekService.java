package com.sema.cicek.service;


import java.util.List;

import com.sema.cicek.model.Cicek;



public interface CicekService {

	/*
	 * CREATE and UPDATE 
	 */
	public void saveCicek(Cicek cicek);

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
