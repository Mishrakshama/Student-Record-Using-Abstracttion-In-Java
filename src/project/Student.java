package project;

public class Student {
	 private String name;
	  private int StudentId;
	  
	  Student(String nm, int sid)
	  {
	    name = nm;
	    StudentId = sid; 
	  } 
	  
	  public void basics()
	  {
	     System.out.println("Student details");
	     System.out.println("Name : " + name);
	     System.out.println("Reg Number : " + StudentId);
	  }
}
