 

class Student 
{ 
int rollno; 
String name;
String address; 

    public Student(int rollno, String name, String address) 
    { 
        this.rollno = rollno; 
        this.name = name; 
        this.address = address; 
    } 
  
   
    public String toString() 
    { 
        return this.rollno + " " + this.name + " " + this.address; 
    } 
    
    public static int prueba(int i)
    {
        return i+5;
    }
} 

// Driver class 
