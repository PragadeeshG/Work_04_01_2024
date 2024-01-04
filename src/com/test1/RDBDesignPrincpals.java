package com.test1;

public class RDBDesignPrincpals {
	private String avoidRedundnacy;
	private String primaryIdentity;
	private String nullValues;
	private String dataTyping;
	private String indexing;
	private String schema;
	private String authAndAccess;
	private String sensitiveData;
	private String notStoringAuthKeys;

	public RDBDesignPrincpals() {

	}

	public RDBDesignPrincpals(String avoidRedundnacy, String primaryIdentity, String nullValues, String dataTyping,
			String indexing, String schema, String authAndAccess, String sensitiveData, String notStoringAuthKeys) {
		super();
		this.avoidRedundnacy = avoidRedundnacy;
		this.primaryIdentity = primaryIdentity;
		this.nullValues = nullValues;
		this.dataTyping = dataTyping;
		this.indexing = indexing;
		this.schema = schema;
		this.authAndAccess = authAndAccess;
		this.sensitiveData = sensitiveData;
		this.notStoringAuthKeys = notStoringAuthKeys;
	}

	public String getAvoidRedundnacy() {
		return avoidRedundnacy;
	}

	public void setAvoidRedundnacy(String avoidRedundnacy) {
		this.avoidRedundnacy = avoidRedundnacy;
	}

	public String getPrimaryIdentity() {
		return primaryIdentity;
	}

	public void setPrimaryIdentity(String primaryIdentity) {
		this.primaryIdentity = primaryIdentity;
	}

	public String getNullValues() {
		return nullValues;
	}

	public void setNullValues(String nullValues) {
		this.nullValues = nullValues;
	}

	public String getDataTyping() {
		return dataTyping;
	}

	public void setDataTyping(String dataTyping) {
		this.dataTyping = dataTyping;
	}

	public String getIndexing() {
		return indexing;
	}

	public void setIndexing(String indexing) {
		this.indexing = indexing;
	}

	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

	public String getAuthAndAccess() {
		return authAndAccess;
	}

	public void setAuthAndAccess(String authAndAccess) {
		this.authAndAccess = authAndAccess;
	}

	public String getSensitiveData() {
		return sensitiveData;
	}

	public void setSensitiveData(String sensitiveData) {
		this.sensitiveData = sensitiveData;
	}

	public String getNotStoringAuthKeys() {
		return notStoringAuthKeys;
	}

	public void setNotStoringAuthKeys(String notStoringAuthKeys) {
		this.notStoringAuthKeys = notStoringAuthKeys;
	}

}
