package oop2_coursework3;

import java.util.Scanner;
import java.util.ArrayList;

public class oop2_coursework3mainclass {
 public static void main(String[]args){
     oop2_coursework3 stds=new oop2_coursework3(56);
     Scanner S=new Scanner(System.in);
    
     //System.out.println(stds.mark);
     String course[]={"oop2","computer networking","ethics","e-commerce","Accounting","research method"};
     ArrayList<Integer> allmarks=new ArrayList();
      int studentsmarks;
      for(;true;){
             oop2_coursework3 std=new oop2_coursework3();
             System.out.println("Enter name:");
             std.setName(S.next());
             System.out.println("Enter Birthdate");
             std.setBirthdate(S.next());
             System.out.println("Enter RegNo" );
             std.setRegno(S.next());
             if(std.getName().toUpperCase().equals("Exit"))
                 break;
                     
         else
             {
      System.out.println("enter student mark Details:");
     for(int x=0;x < 6; x++){
        System.out.print(course[x]+":"); 
         studentsmarks=S.nextInt();
         stds.setMark(studentsmarks);
         allmarks.add(studentsmarks);
         
     }
         
     }
     int total=0;
     for(int q=0;q< allmarks.size(); q++){
      total+= allmarks.get(q);
 }
     int average=total/6;
     System.out.println("total marks:"+ total);
     System.out.println("average marks:"+ average);
     allmarks.clear();
 } 
 }



	}


