package tn.test.data.services;

import java.util.List;

import tn.test.data.entities.Environnement;



public interface IEnvironnementService {
	List<Environnement> retrieveAllEnvironnements();

	Environnement addEnvironnement(Environnement e);

}
