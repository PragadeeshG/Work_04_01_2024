package com.test1;

public class RDBClasses {
	private String rdbCode;
	private String rdbName;
	private String relations;
	private String attributes;
	private String primaries;
	private String normalization;
	private String dataAccess;
	private String stages;
	private String shortTransaction;
	private String longTransaction;

	public RDBClasses() {

	}

	public RDBClasses(String rdbCode, String rdbName, String relations, String attributes, String primaries,
			String normalization, String dataAccess, String stages, String shortTransaction, String longTransaction) {
		super();
		this.rdbCode = rdbCode;
		this.rdbName = rdbName;
		this.relations = relations;
		this.attributes = attributes;
		this.primaries = primaries;
		this.normalization = normalization;
		this.dataAccess = dataAccess;
		this.stages = stages;
		this.shortTransaction = shortTransaction;
		this.longTransaction = longTransaction;
	}

	public String getRdbCode() {
		return rdbCode;
	}

	public void setRdbCode(String rdbCode) {
		this.rdbCode = rdbCode;
	}

	public String getRdbName() {
		return rdbName;
	}

	public void setRdbName(String rdbName) {
		this.rdbName = rdbName;
	}

	public String getRelations() {
		return relations;
	}

	public void setRelations(String relations) {
		this.relations = relations;
	}

	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public String getPrimaries() {
		return primaries;
	}

	public void setPrimaries(String primaries) {
		this.primaries = primaries;
	}

	public String getNormalization() {
		return normalization;
	}

	public void setNormalization(String normalization) {
		this.normalization = normalization;
	}

	public String getDataAccess() {
		return dataAccess;
	}

	public void setDataAccess(String dataAccess) {
		this.dataAccess = dataAccess;
	}

	public String getStages() {
		return stages;
	}

	public void setStages(String stages) {
		this.stages = stages;
	}

	public String getShortTransaction() {
		return shortTransaction;
	}

	public void setShortTransaction(String shortTransaction) {
		this.shortTransaction = shortTransaction;
	}

	public String getLongTransaction() {
		return longTransaction;
	}

	public void setLongTransaction(String longTransaction) {
		this.longTransaction = longTransaction;
	}

}
