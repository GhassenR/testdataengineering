package tn.test.data.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.test.data.entities.Environnement;
import tn.test.data.repositories.EnvironnementRepository;



@Service
@Slf4j
public class EnvironnementServiceImp implements IEnvironnementService {
	
	@Autowired
	EnvironnementRepository env;
	
	@Override
	public List<Environnement> retrieveAllEnvironnements() {
		List<Environnement> envtList = env.findAll();
		for(Environnement env : envtList) {
			log.info(env.toString());
		
		}
		return envtList;
	}

	@Override
	public Environnement addEnvironnement(Environnement e) {
		/*
		 
		 e.setAdresse_codepostal(e.getAdresse_codepostal());
		 e.setAdresse_libellevoie(e.getAdresse_libellevoie());
		 e.setAdresse_numero(e.getAdresse_numero());
		e.setAdresse_typevoie(e.getAdresse_typevoie());
		e.setAncien_nom_ev(e.getAncien_nom_ev());
		e.setAnnee_changement_nom(e.getAnnee_changement_nom());
		e.setAnnee_ouverture(e.getAnnee_ouverture());
		e.setCategorie(e.getCategorie());
		e.setCompetence(e.getCompetence());
		e.setId_atelier_horticole(e.getId_atelier_horticole());
		e.setId_division(e.getId_division());
		e.setId_eqpt(e.getId_eqpt());
		e.setIda3d_enb(e.getIda3d_enb());
		e.setNb_entites(e.getNb_entites());
		e.setNom_ev(e.getNom_ev());
		e.setNsq_espace_vert(e.getNsq_espace_vert());
		e.setOuvert_ferme(e.getOuvert_ferme());
		e.setPerimeter(e.getPerimeter());
		e.setPoly_area(e.getPoly_area());
		e.setPresence_cloture(e.getPresence_cloture());
		e.setPresence_cloture(e.getPresence_cloture());
		e.setSite_villes(e.getSite_villes());
		e.setSurface_horticole(e.getSurface_horticole());
		e.setSurface_totale_reelle(e.getSurface_totale_reelle());
		e.setType_ev(e.getType_ev());
	
		 
		
		return env.save(e);
		
		*/
		return null;
		
	}

}
