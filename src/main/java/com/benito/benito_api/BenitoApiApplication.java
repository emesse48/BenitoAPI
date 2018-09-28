package com.benito.benito_api;

import org.bson.types.ObjectId;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.annotation.Id;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages= {"com.benito.benito_api.controller", "com.benito.benito_rest.repositories"})
public class BenitoApiApplication {	
	
	public static void main(String[] args) {
		SpringApplication.run(BenitoApiApplication.class, args);
	}
	
	@Id
	public ObjectId _id;
	
	public String refCourse;
	public String idCourse;
	public String type;
	public String statutCourse;
	public String dateCourse;
	public String mode;
	public String codeMission;
	public String codeLigneCommerciale;
	public String typeDeCourse;
	public String uoTransporteur;
	public String typeReference;
	public String source;
	public String technicalId;
	public String destinationUtcHoraire;
	public String destinationJalon;
	public String compositionCourtLong;
	
	// Constructors
	public BenitoApiApplication() {}
	
	public BenitoApiApplication(			
			ObjectId _id,
			String refCourse,
			String idCourse,
			String type,
			String statutCourse,
			String dateCourse,
			String mode,
			String codeMission,
			String codeLigneCommerciale,
			String typeDeCourse,
			String uoTransporteur,
			String typeReference,
			String source,
			String technicalId,
			String destinationUtcHoraire,
			String destinationJalon,
			String compositionCourtLong)
	{
		this.refCourse = 
				this.idCourse = idCourse;
				this.type = type;
				this.statutCourse = statutCourse;
				this.dateCourse = dateCourse;
				this.mode = mode;
				this.codeMission = codeMission;
				this.codeLigneCommerciale = codeLigneCommerciale;
				this.typeDeCourse = typeDeCourse;
				this.uoTransporteur = uoTransporteur;
				this.typeReference = typeReference;
				this.source = source;
				this.technicalId = technicalId;
				this.destinationUtcHoraire = destinationUtcHoraire;
				this.destinationJalon = destinationJalon;
				this.compositionCourtLong = compositionCourtLong;
	}
	
	// ObjectId needs to be converted to string
	  public String get_id() { return _id.toHexString(); }
	  public void set_id(ObjectId _id) { this._id = _id; }

	public String getRefCourse() {
		return refCourse;
	}

	public void setRefCourse(String refCourse) {
		this.refCourse = refCourse;
	}

	public String getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(String idCourse) {
		this.idCourse = idCourse;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatutCourse() {
		return statutCourse;
	}

	public void setStatutCourse(String statutCourse) {
		this.statutCourse = statutCourse;
	}

	public String getDateCourse() {
		return dateCourse;
	}

	public void setDateCourse(String dateCourse) {
		this.dateCourse = dateCourse;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getCodeMission() {
		return codeMission;
	}

	public void setCodeMission(String codeMission) {
		this.codeMission = codeMission;
	}

	public String getCodeLigneCommerciale() {
		return codeLigneCommerciale;
	}

	public void setCodeLigneCommerciale(String codeLigneCommerciale) {
		this.codeLigneCommerciale = codeLigneCommerciale;
	}

	public String getTypeDeCourse() {
		return typeDeCourse;
	}

	public void setTypeDeCourse(String typeDeCourse) {
		this.typeDeCourse = typeDeCourse;
	}

	public String getUoTransporteur() {
		return uoTransporteur;
	}

	public void setUoTransporteur(String uoTransporteur) {
		this.uoTransporteur = uoTransporteur;
	}

	public String getTypeReference() {
		return typeReference;
	}

	public void setTypeReference(String typeReference) {
		this.typeReference = typeReference;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTechnicalId() {
		return technicalId;
	}

	public void setTechnicalId(String technicalId) {
		this.technicalId = technicalId;
	}

	public String getDestinationUtcHoraire() {
		return destinationUtcHoraire;
	}

	public void setDestinationUtcHoraire(String destinationUtcHoraire) {
		this.destinationUtcHoraire = destinationUtcHoraire;
	}

	public String getDestinationJalon() {
		return destinationJalon;
	}

	public void setDestinationJalon(String destinationJalon) {
		this.destinationJalon = destinationJalon;
	}

	public String getCompositionCourtLong() {
		return compositionCourtLong;
	}

	public void setCompositionCourtLong(String compositionCourtLong) {
		this.compositionCourtLong = compositionCourtLong;
	}
	  
	  
}

