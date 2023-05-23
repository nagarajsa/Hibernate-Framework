package Employee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp 
{
	@Id
	private String Emp_name;
	private int Emp_id;

	public String getEmp_name() 
	{
		return Emp_name;
	}

	public void setEmp_name(String emp_name) 
	{
		Emp_name = emp_name;
	}

	public int getEmp_id() 
	{
		return Emp_id;
	}

	public void setEmp_id(int emp_id) 
	{
		Emp_id = emp_id;
	}

	@Override
	public String toString() {
		return "Emp [Emp_name=" + Emp_name + ", Emp_id=" + Emp_id + "]";
	}
		

}
