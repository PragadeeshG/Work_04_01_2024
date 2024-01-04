package com.test1;

public class Constraints {
	private String constraintId;
	private String domainConstraint;
	private String integrity;
	private String keyIntegrity;
	private String referentialIntegrity;
	private String anomalies;
	private String insertionAnomaly;
	private String deletionAnomaly;
	private String updationAnamoly;
	private String relationalAnoamaly;
	private String deleteCascade;
	private String updateCascade;
	private String superKeys;

	public Constraints() {

	}

	public Constraints(String constraintId, String domainConstraint, String integrity, String keyIntegrity,
			String referentialIntegrity, String anomalies, String insertionAnomaly, String deletionAnomaly,
			String updationAnamoly, String relationalAnoamaly, String deleteCascade, String updateCascade,
			String superKeys) {
		super();
		this.constraintId = constraintId;
		this.domainConstraint = domainConstraint;
		this.integrity = integrity;
		this.keyIntegrity = keyIntegrity;
		this.referentialIntegrity = referentialIntegrity;
		this.anomalies = anomalies;
		this.insertionAnomaly = insertionAnomaly;
		this.deletionAnomaly = deletionAnomaly;
		this.updationAnamoly = updationAnamoly;
		this.relationalAnoamaly = relationalAnoamaly;
		this.deleteCascade = deleteCascade;
		this.updateCascade = updateCascade;
		this.superKeys = superKeys;
	}

	public String getConstraintId() {
		return constraintId;
	}

	public void setConstraintId(String constraintId) {
		this.constraintId = constraintId;
	}

	public String getDomainConstraint() {
		return domainConstraint;
	}

	public void setDomainConstraint(String domainConstraint) {
		this.domainConstraint = domainConstraint;
	}

	public String getIntegrity() {
		return integrity;
	}

	public void setIntegrity(String integrity) {
		this.integrity = integrity;
	}

	public String getKeyIntegrity() {
		return keyIntegrity;
	}

	public void setKeyIntegrity(String keyIntegrity) {
		this.keyIntegrity = keyIntegrity;
	}

	public String getReferentialIntegrity() {
		return referentialIntegrity;
	}

	public void setReferentialIntegrity(String referentialIntegrity) {
		this.referentialIntegrity = referentialIntegrity;
	}

	public String getAnomalies() {
		return anomalies;
	}

	public void setAnomalies(String anomalies) {
		this.anomalies = anomalies;
	}

	public String getInsertionAnomaly() {
		return insertionAnomaly;
	}

	public void setInsertionAnomaly(String insertionAnomaly) {
		this.insertionAnomaly = insertionAnomaly;
	}

	public String getDeletionAnomaly() {
		return deletionAnomaly;
	}

	public void setDeletionAnomaly(String deletionAnomaly) {
		this.deletionAnomaly = deletionAnomaly;
	}

	public String getUpdationAnamoly() {
		return updationAnamoly;
	}

	public void setUpdationAnamoly(String updationAnamoly) {
		this.updationAnamoly = updationAnamoly;
	}

	public String getRelationalAnoamaly() {
		return relationalAnoamaly;
	}

	public void setRelationalAnoamaly(String relationalAnoamaly) {
		this.relationalAnoamaly = relationalAnoamaly;
	}

	public String getDeleteCascade() {
		return deleteCascade;
	}

	public void setDeleteCascade(String deleteCascade) {
		this.deleteCascade = deleteCascade;
	}

	public String getUpdateCascade() {
		return updateCascade;
	}

	public void setUpdateCascade(String updateCascade) {
		this.updateCascade = updateCascade;
	}

	public String getSuperKeys() {
		return superKeys;
	}

	public void setSuperKeys(String superKeys) {
		this.superKeys = superKeys;
	}

}
