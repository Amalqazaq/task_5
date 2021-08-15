
public class Location extends Country {
 private int loc_id;
 private String street_address;
 private String postal_code;
 private String state_province;
 private String City;
 
 
 
 
public int getLoc_id() {
	return loc_id;
}
public void setLoc_id(int loc_id) {
	this.loc_id = loc_id;
}
public String getStreet_address() {
	return street_address;
}
public void setStreet_address(String street_address) {
	this.street_address = street_address;
}
public String getPostal_code() {
	return postal_code;
}
public void setPostal_code(String postal_code) {
	this.postal_code = postal_code;
}
public String getState_province() {

	return state_province;
}
public void setState_province(String state_province) {
	this.state_province = state_province;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
}
