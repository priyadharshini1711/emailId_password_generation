import java.util.*;

    public class emailApp
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner (System.in);
            System.out.println("Hey user welcome to abc email services\n Enter your firstname and lastname");
            String fname=sc.next();
            String lname=sc.next();
            email em1=new email(fname,lname);
            System.out.print("Enter alternate email address");
            String altemail=sc.next();
            em1.setAlternateEmail(altemail);
            em1.getUserInfo();
        }

    }
