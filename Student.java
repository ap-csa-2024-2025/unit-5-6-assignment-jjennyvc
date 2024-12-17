public class Student
{
  private int ID;
  private int grade;
  private String name;

  // Constructors
  public Student(int input_id, int input_grade, String input_name)
  {
    id = input_id;
    grade = input_grade;
    name = input_name;
  }

  public String toString()
  {
    return "ID: " + ID + "\nName: " + name + "\nGrade: " + grade;
  }
  public Student()
  {
    ID = 441876;
    grade = 11;
    name = "Jenny";
  }

  public Student(int ID, int grade, String name)
  {
    ID = iID;
    grade = igrade;
    name = iname;
  }

  public void setID(int ID)
  {
    this.ID = ID;
  }
  
}
