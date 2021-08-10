package net.guides.springboot.crud.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "Employee")
public class Employee {

	@Transient
    public static final String SEQUENCE_NAME = "users_sequence";
	
	@Id
	private long id;
	
	@NotBlank
    @Size(max=100)
    @Indexed(unique=true)
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String location;
	private String technology;
	private String enquirySource;
	private String status;
	private String enquiryDateCreated;
	private String nextFollowUpDate;
	


	
	@NotBlank
    @Size(max=100)
    @Indexed(unique=true)
	private String emailId;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, String emailId, String phoneNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.emailId = phoneNum;
		this.emailId = location;
		this.emailId = technology;
		this.emailId = enquirySource;
		this.emailId = status;
	
	}

	public String getEnquiryDateCreated() {
		return enquiryDateCreated;
	}

	public void setEnquiryDateCreated(String enquiryDateCreated) {
		this.enquiryDateCreated = enquiryDateCreated;
	}

	public String getNextFollowUpDate() {
		return nextFollowUpDate;
	}

	public void setNextFollowUpDate(String nextFollowUpDate) {
		this.nextFollowUpDate = nextFollowUpDate;
	}
	
	

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String phoneNum() {
		return emailId;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getEnquirySource() {
		return enquirySource;
	}

	public void setEnquirySource(String enquirySource) {
		this.enquirySource = enquirySource;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", phoneNum=" + phoneNum + ", location=" + location + ", enquirySource=" + enquirySource + ", status=" + 
				status + ", technology =" + technology + "enquiryDateCreated =" + enquiryDateCreated + "nextFollowUpDate =" + nextFollowUpDate + "]";
	}	
}
