package com.test1;

public class RDBKeyPrincipals {
	private String integrity;
	private String information;
	private String performance;
	private String scalability;
	private String security;
	private String maintenance;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public RDBKeyPrincipals() {

	}

	public RDBKeyPrincipals(String integrity, String information, String performance, String scalability,
			String security, String maintenance, String creationDate, String modifiedDate, String entityState) {
		super();
		this.integrity = integrity;
		this.information = information;
		this.performance = performance;
		this.scalability = scalability;
		this.security = security;
		this.maintenance = maintenance;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getIntegrity() {
		return integrity;
	}

	public void setIntegrity(String integrity) {
		this.integrity = integrity;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	public String getScalability() {
		return scalability;
	}

	public void setScalability(String scalability) {
		this.scalability = scalability;
	}

	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	public String getMaintenance() {
		return maintenance;
	}

	public void setMaintenance(String maintenance) {
		this.maintenance = maintenance;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
