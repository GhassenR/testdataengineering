package tn.test.data.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Environnement implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long nsq_espace_vert;
	private String nom_ev;
	private String type_ev;
	private String categorie;
	private long surface_totale_reelle;
	private long poly_area;
	private long surface_horticole;
	private long perimeter;
	private String presence_cloture;
	private String ouvert_ferme;
	private String ancien_nom_ev;
	private String annee_changement_nom;
	private int adresse_numero;
	private String adresse_typevoie;
	private String adresse_libellevoie;
	private String adresse_codepostal;
	private String annee_ouverture;
	private int nb_entites;
	private String competence;
	private int id_division;
	private int id_atelier_horticole;
	private String ida3d_enb;
	private String id_eqpt;
	private String site_villes;
	
}