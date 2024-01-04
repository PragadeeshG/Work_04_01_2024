package com.test1;

public class MappingERModel {
	private long entityTypes;
	private String relationshipTypes;
	private String attributeTypes;
	private String multivalAttr;
	private String weakEntity;
	private String strongEntity;
	private String aggregation;
	private String specialization;

	public MappingERModel() {

	}

	public MappingERModel(long entityTypes, String relationshipTypes, String attributeTypes, String multivalAttr,
			String weakEntity, String strongEntity, String aggregation, String specialization) {
		super();
		this.entityTypes = entityTypes;
		this.relationshipTypes = relationshipTypes;
		this.attributeTypes = attributeTypes;
		this.multivalAttr = multivalAttr;
		this.weakEntity = weakEntity;
		this.strongEntity = strongEntity;
		this.aggregation = aggregation;
		this.specialization = specialization;
	}

	public long getEntityTypes() {
		return entityTypes;
	}

	public void setEntityTypes(long entityTypes) {
		this.entityTypes = entityTypes;
	}

	public String getRelationshipTypes() {
		return relationshipTypes;
	}

	public void setRelationshipTypes(String relationshipTypes) {
		this.relationshipTypes = relationshipTypes;
	}

	public String getAttributeTypes() {
		return attributeTypes;
	}

	public void setAttributeTypes(String attributeTypes) {
		this.attributeTypes = attributeTypes;
	}

	public String getMultivalAttr() {
		return multivalAttr;
	}

	public void setMultivalAttr(String multivalAttr) {
		this.multivalAttr = multivalAttr;
	}

	public String getWeakEntity() {
		return weakEntity;
	}

	public void setWeakEntity(String weakEntity) {
		this.weakEntity = weakEntity;
	}

	public String getStrongEntity() {
		return strongEntity;
	}

	public void setStrongEntity(String strongEntity) {
		this.strongEntity = strongEntity;
	}

	public String getAggregation() {
		return aggregation;
	}

	public void setAggregation(String aggregation) {
		this.aggregation = aggregation;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

}
