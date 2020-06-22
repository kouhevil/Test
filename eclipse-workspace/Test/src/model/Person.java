package model;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
	
	private StringProperty firstname;
	private StringProperty lastname;
	private StringProperty city;
	private StringProperty street;
	private IntegerProperty bp;
	private ObjectProperty<LocalDate> birthday;
	
	public Person() {
		this(null,null);
	}
	
	public Person(String lastname, String firstname) {
		this.firstname = new SimpleStringProperty(firstname);
		this.lastname = new SimpleStringProperty(lastname);
		this.bp = new SimpleIntegerProperty(76800);
		this.birthday = new SimpleObjectProperty<LocalDate>(LocalDate.of(2000, 05, 30) );
	}

	public String getFirstName() {
		return firstname.get();
	}
	public void setFirstName(String firstName) {
		this.firstname.set(firstName);
	}
	
	public StringProperty firstNameProperty() {
		return firstname;
	}
	public String getLastName() {
		return lastname.get();
	}
	public void setLastName(String lastName) {
		this.lastname.set(lastName);
	}
	
	public StringProperty lastNameProperty() {
		return lastname;
	}
	public String getStreet() {
		return street.get();
	}
	public void setStreet(String street) {
		this.street.set(street);
	}
	
	public StringProperty streetProperty() {
		return street;
	}
	public int getBp() {
		return bp.get();
	}
	public void setBp(int bp) {
		this.bp.set(bp);
	}
	
	public IntegerProperty bpProperty() {
		return bp;
	}
	public String getCity() {
		return city.get();
	}
	public void setCity(String city) {
		this.city.set(city);
	}
	
	public StringProperty cityProperty() {
		return city;
	}
	public LocalDate getBirthday() {
		return birthday.get();
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday.set(birthday);
	}
	
	public ObjectProperty<LocalDate> birthdayProperty() {
		return birthday;
	}


}
