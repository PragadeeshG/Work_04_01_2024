package com.test1;

public class RDBNorm {
	private String normalForm;
	private String firstNormalForm;
	private String secondNormalForm;
	private boolean ThirdNormalForm;
	private boolean BoyceCoddNormalForm;
	private String firfthNormalForm;
	private String redundancy;
	private String concurrence;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public RDBNorm() {

	}

	public RDBNorm(String normalForm, String firstNormalForm, String secondNormalForm, boolean thirdNormalForm,
			boolean boyceCoddNormalForm, String firfthNormalForm, String redundancy, String concurrence,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.normalForm = normalForm;
		this.firstNormalForm = firstNormalForm;
		this.secondNormalForm = secondNormalForm;
		ThirdNormalForm = thirdNormalForm;
		BoyceCoddNormalForm = boyceCoddNormalForm;
		this.firfthNormalForm = firfthNormalForm;
		this.redundancy = redundancy;
		this.concurrence = concurrence;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getNormalForm() {
		return normalForm;
	}

	public void setNormalForm(String normalForm) {
		this.normalForm = normalForm;
	}

	public String getFirstNormalForm() {
		return firstNormalForm;
	}

	public void setFirstNormalForm(String firstNormalForm) {
		this.firstNormalForm = firstNormalForm;
	}

	public String getSecondNormalForm() {
		return secondNormalForm;
	}

	public void setSecondNormalForm(String secondNormalForm) {
		this.secondNormalForm = secondNormalForm;
	}

	public boolean isThirdNormalForm() {
		return ThirdNormalForm;
	}

	public void setThirdNormalForm(boolean thirdNormalForm) {
		ThirdNormalForm = thirdNormalForm;
	}

	public boolean isBoyceCoddNormalForm() {
		return BoyceCoddNormalForm;
	}

	public void setBoyceCoddNormalForm(boolean boyceCoddNormalForm) {
		BoyceCoddNormalForm = boyceCoddNormalForm;
	}

	public String getFirfthNormalForm() {
		return firfthNormalForm;
	}

	public void setFirfthNormalForm(String firfthNormalForm) {
		this.firfthNormalForm = firfthNormalForm;
	}

	public String getRedundancy() {
		return redundancy;
	}

	public void setRedundancy(String redundancy) {
		this.redundancy = redundancy;
	}

	public String getConcurrence() {
		return concurrence;
	}

	public void setConcurrence(String concurrence) {
		this.concurrence = concurrence;
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
