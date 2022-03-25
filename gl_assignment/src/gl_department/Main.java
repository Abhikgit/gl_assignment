package gl_department;

class SuperDepartment {
	public void today()
	{
		int ad = 0;
		if(ad==0) {
			System.out.println("Today is not a Holiday");
		}
		else {
			System.out.println("Today is a Holiday");
		}
	}

   public String departmentName() {
   return "Welcome to Super Department";

	}
   public String getTodaysWork() {
	   return "No Work as of now";

		}
   public String getWorkDeadline() {
	   return "Nil";
	   
   }
}

class AdminDepartment extends SuperDepartment {
	
	 public String departmentName() {
		   return "Welcome to Admin Department";

			}
		   public String getTodaysWork() {
			   return "Complete your documents submission";

				}
		   public String getWorkDeadline() {
			   return "Complete by EOD";
			   
}
}

class HRDepartment extends AdminDepartment {
	
	 public String departmentName() {
		   return "Welcome to HR Department";

			}
		   public String getTodaysWork() {
			   return "Fill today's worksheet and mark your attendance";

				}
		   public String getWorkDeadline() {
			   return "Complete by EOD";
			   
		   }
		   public String doActivity() {
			   return "team Lunch";
		   }
}

class TechDepartment extends HRDepartment {
	
	 public String departmentName() {
		   return "Welcome to Tech Department";

			}
		   public String getTodaysWork() {
			   return "Complete coding of module 1";

				}
		   public String getWorkDeadline() {
			   return "Complete by EOD";
			   
		   }
		   public String getTechStackInformation() {
			   return "core Java";
		   }
}
public class Main {

	public static void main(String[] args)
	{
		SuperDepartment obj1 = new AdminDepartment();
		SuperDepartment obj2 = new HRDepartment();
		SuperDepartment obj3 = new TechDepartment();
		HRDepartment obj = new HRDepartment();
		TechDepartment objj = new TechDepartment();
		SuperDepartment day = new AdminDepartment();
		SuperDepartment day1 = new HRDepartment();
		SuperDepartment day2 = new TechDepartment();
		System.out.println(obj1.departmentName());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		day.today();
		System.out.println(obj2.departmentName());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj.doActivity());
		day1.today();
		System.out.println(obj3.departmentName());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(objj.getTechStackInformation());
		day2.today();
	}
	}
	
