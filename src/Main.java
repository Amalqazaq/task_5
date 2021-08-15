import java.util.*;
import java.sql.*;

public class Main {
	
	public static List<Job> getJob(Connection connection) {
		String sql="SELECT job_id FROM jobs ORDER BY max_salary";
		List<Job> jobs=new ArrayList<Job>();
		try {
		Statement stmt=connection.createStatement();
		ResultSet rs=stmt.executeQuery(sql);  
		while(rs.next()) {
			Job job=new Job();
			job.setJob_id(rs.getInt(1));
			jobs.add(job);
			System.out.println(job.getJob_id());
		}
	
		}
		catch
		(Exception ex) {
			System.out.println("fail!");
			System.out.println(ex.toString());
		}
	
		return jobs;
	}
	
	public static List<Employee> getMaxSalary(Connection connection) {
		String sql="SELECT MIN(salary) AS smallestSalary FROM employees  Where department_id=10";
		List<Employee> employees=new ArrayList<Employee>();
		try {
			Statement stmt=connection.createStatement();
			ResultSet rs=stmt.executeQuery(sql);  
			while(rs.next()) {
                Employee employee=new Employee();
                employee.setSalary(rs.getDouble(1));
                employees.add(employee);
				System.out.println(employee.getSalary());
				
			
			}
		}
			catch
			(Exception ex) {
				System.out.println("fail!");
				System.out.println(ex.toString());
			}
		
			return employees;
		
	
		}
	
	public static List<Location> getCity(Connection connection){
		String sql="SELECT * FROM  locations WHERE city LIKE \'s%\'";
		List<Location> locations=new ArrayList<Location>();
		
		
		try {
			Statement stmt=connection.createStatement();
			ResultSet rs=stmt.executeQuery(sql);  
			while(rs.next()) {
                Location location=new Location();
                location.setCity(rs.getString("city"));
                location.setLoc_id(rs.getInt("location_id"));
                location.setStreet_address(rs.getString("street_address"));
                location.setPostal_code(rs.getString("postal_code"));
                location.setState_province(rs.getString("state_province"));
                location.setCountry_id(rs.getString("country_id"));
                locations.add(location);
				System.out.println(location.getLoc_id() +" "+ location.getCity()+ " " +location.getStreet_address()+" "+location.getPostal_code()
				+" "+location.getState_province()+ " "+ location.getCountry_id());
				
			
			}
		}
			catch
			(Exception ex) {
				System.out.println("fail!");
				System.out.println(ex.toString());
			}
		
		
		return locations;
	}
	
	public static List<Department> getDepartment(Connection connection){
	  String sql="SELECT * FROM departments WHERE department_name IN (\'Administration\',\'Public Relations\',\'Accounting\')";
	  List<Department> departments=new ArrayList<Department>();
	  
	  try {
			Statement stmt=connection.createStatement();
			ResultSet rs=stmt.executeQuery(sql);  
			while(rs.next()) {
				Department department=new Department();
				department.setDepartment_id(rs.getInt("department_id"));
				department.setDepartment_name(rs.getString("department_name"));
				department.setLoc(null);
				departments.add(department);
				System.out.println(department.getDepartment_name() +" "+department.getDepartment_id());
		
			}
		}
			catch
			(Exception ex) {
				System.out.println("fail!");
				System.out.println(ex.toString());
			}
		
		
		return departments ;
	}
	
	
	
	public static List<Country> regionCount(Connection connection){
		String sql="SELECT region_id, COUNT(country_id) AS COUNTS FROM countries GROUP BY region_id";
		 List<Country> countries=new ArrayList<Country>();
		 try {
				Statement stmt=connection.createStatement();
				ResultSet rs=stmt.executeQuery(sql);  
				while(rs.next()) {
					Country country=new Country();
					country.setRegion_id(rs.getInt("region_id"));
					country.setCountry_id(null);
					countries.add(country);
					System.out.println(country.getRegion_id()+ " "+rs.getInt("COUNTS"));
			
				}
			}
				catch
				(Exception ex) {
					System.out.println("fail!");
					System.out.println(ex.toString());
				}
		
		
		return countries;
	}
	
	
	
	
	
	/*public static List<Employee> employeesNames(Connection connection){
		String sql="SELECT employees.first_name ,dependents.first_name FROM employees LEFT JOIN dependents ON employees.employee_id=dependents.employee_id";
		 List<Employee> employees=new ArrayList<Employee>();
		 try {
				Statement stmt=connection.createStatement();
				ResultSet rs=stmt.executeQuery(sql);  
				while(rs.next()) {
					Employee employee=new Employee();
					employee.setFirst_name(rs.getString("first_name"));
					employee.setDependents(rs);
					employees.add(employee);
					System.out.println();
			
				}
			}
				catch
				(Exception ex) {
					System.out.println("fail!");
					System.out.println(ex.toString());
				}
		
		
		return employees;
	}*/
	
	
	
	
	
	
	
	public static void main(String[] args) {
		String path="jdbc:sqlserver://192.168.0.171:49170;databaseName=master";
		String user="amalDB";
		String password="12345";
		
		try {
			Connection connection=DriverManager.getConnection(path, user, password);
			System.out.println("SUCCESS!");
			
			regionCount(connection);
			 
			
			connection.close();
		}
		catch(Exception ex) {
			System.out.println("fail!");
			System.out.println(ex.toString());
		}
	}
	}
