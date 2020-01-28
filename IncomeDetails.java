package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="incomedetails")
public class IncomeDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE ,generator="sequence_lid")
	@Column(name="loan_id")
	private int loanId;//auto generated
	
	@Column(name="property_location")
	private String propertyLocation;
	@Column(name="organisation_type")
	private String organisationType;
	@Column(name="property_name")
	private String propertyName;
	@Column(name="customer_name")
	private String customerName;
	@Column(name="estimated_amount")
	private long  estimatedAmount;
	@Column(name="type_of_employement")
	private String typeOfEmployement;
	@Column(name="retirement_age")
	private int retirementAge;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customer_id")
	private Customer customer;
	public IncomeDetails() {
		
		
		super();
		
	}
	public IncomeDetails( String propertyLocation, String organisationType, String propertyName,
			String customerName, long estimatedAmount, String typeOfEmployement, int retirementAge) {
		super();
		
		this.propertyLocation = propertyLocation;
		this.organisationType = organisationType;
		this.propertyName = propertyName;
		this.customerName = customerName;
		this.estimatedAmount = estimatedAmount;
		this.typeOfEmployement = typeOfEmployement;
		this.retirementAge = retirementAge;
	}
	
	
	
	public IncomeDetails(int loanId, String propertyLocation, String organisationType, String propertyName,
			String customerName, long estimatedAmount, String typeOfEmployement, int retirementAge, Customer customer) {
		super();
		this.loanId = loanId;
		this.propertyLocation = propertyLocation;
		this.organisationType = organisationType;
		this.propertyName = propertyName;
		this.customerName = customerName;
		this.estimatedAmount = estimatedAmount;
		this.typeOfEmployement = typeOfEmployement;
		this.retirementAge = retirementAge;
		this.customer = customer;
	}
	public String getPropertyLocation() {
		return propertyLocation;
	}
	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}
	public String getOrganisationType() {
		return organisationType;
	}
	public void setOrganisationType(String organisationType) {
		this.organisationType = organisationType;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getEstimatedAmount() {
		return estimatedAmount;
	}
	public void setEstimatedAmount(long estimatedAmount) {
		this.estimatedAmount = estimatedAmount;
	}
	public String getTypeOfEmployement() {
		return typeOfEmployement;
	}
	public void setTypeOfEmployement(String typeOfEmployement) {
		this.typeOfEmployement = typeOfEmployement;
	}
	public int getRetirementAge() {
		return retirementAge;
	}
	public void setRetirementAge(int retirementAge) {
		this.retirementAge = retirementAge;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
	
	
}
