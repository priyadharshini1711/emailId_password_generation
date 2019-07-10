import java.util.*;

public class email {
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private String emailid;
    private int capacity = 500;
    private String alternateemail;
    private String companysuffix="companyname.com";

    //firstname and lastname 
    public email(String fname,String lname)
    {
        this.firstname=fname;
        this.lastname=lname;
        this.password=setPassword(10);
        this.department=setDepartment();
        this.alternateemail=getAlternateEmail();
        emailid = firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companysuffix;
    }

    private String setDepartment()
    {
        System.out.println("Enter Department code \n1. Sale \n2. Development \n3. Accounting \n4. None");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:return "sales";
            case 2:return "development";
            case 3:return "accounting";
            default:return "";
        }
    }

    Scanner sc=new Scanner(System.in);

    public String setPassword(int length)
    {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!#$%^&*";
        char [] pass = new char[length];
        for(int i=0;i<length;i++){
            int rand =(int) (Math.random()*passwordSet.length());
            pass[i]=passwordSet.charAt(rand);
        }
        return new String(pass);
    }

    //capacity

    public void setMailBoxCapacity(int c)
    {
        this.capacity=c;
    }

    //alternate email 
    public void setAlternateEmail(String altemail)
    {
        this.alternateemail=altemail;
    }

    public void changePassword(String password)
    {
        this.password=password;
    }

    public int getMailBoxCapacity()
    {
        return capacity;
    }

    public String getAlternateEmail()
    {
        return alternateemail;
    }

    public String getPassword()
    {
        return password;
    }

    public void getUserInfo()
    {
        System.out.println("First Name = "+this.firstname);
        System.out.println("Last Name ="+ this.lastname);
        System.out.println("Email ="+this.emailid);
        System.out.println("Password ="+this.password);
        System.out.print("Alternate email id ="+this.alternateemail);
    }

}

