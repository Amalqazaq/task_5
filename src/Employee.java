
public class Employee {
  private int employee_id;
  private String first_name;
  private String last_name;
  private String email;
  private String phonenumber;
  private String hire_date;
  private int job_id;
  Employee manger_id;
  private double salary;
  Department department_id;
  Dependent [] dependents;
 
 
 
public Dependent[] getDependents() {
	return dependents;
}
public void setDependents(Dependent[] dependents) {
	this.dependents = dependents;
}
public int getEmployee_id() {
	return employee_id;
}
public void setEmployee_id(int employee_id) {
	this.employee_id = employee_id;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public String getHire_date() {
	return hire_date;
}
public void setHire_date(String hire_date) {
	this.hire_date = hire_date;
}
public int getJob_id() {
	return job_id;
}
public void setJob_id(int job_id) {
	this.job_id = job_id;
}


public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

}
