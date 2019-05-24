package Models;

import java.time.LocalDate;
import java.util.List;

public class Users {
	
	private String firstName,lastName,phoneNumber,password;
	private LocalDate fecha;
	private int userId;
	private List<Videos> videos;
	public Users(String firstName, String lastName, String phoneNumber, String password, LocalDate fecha, int userId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.fecha = fecha;
		this.userId = userId;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public List<Videos> getVideos() {
		return videos;
	}
	public void setVideos(List<Videos> videos) {
		this.videos = videos;
	}
	public static Boolean compareId(int userId, int id) {
		Boolean output = false;
		if (userId>id) output=true;
		return output;
	}
	
	@Override
	public String toString() {
		return "Usuario Id = " + userId + "\n Nombre = " + firstName + " " + lastName + "\n Telefono = " + phoneNumber + "\n Videos:\n " + videos + "\n";
	}
	
}
