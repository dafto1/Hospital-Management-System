/**
 * Hospital Management System : 
 * A menu based program which enables you to view and edit patient's list  and also view doctor's list 
 * i know it is a very basic program but excuse it as it is my first repository on github
 */
package Hospital_Managment_System;

import java.util.*;

class doctor{
    String name ;
    String speciality ;
    String Room ;
   
   }
class patient{
    String name ;
    String disease;
    String Room ;
    String Gender ;
    int age ;
    void ask_info(){
        Scanner patient = new Scanner(System.in);
        System.out.println("Name: ");
        name = patient.nextLine();
        System.out.println("Disease: ");
        disease = patient.nextLine();
        System.out.println("Gender: ");
        Gender = patient.nextLine();
        System.out.println("Age : ");
        age = patient.nextInt();
    }
    void print_info(){
        System.out.println(name + disease+ Room + Gender + age );
    }
}
public class HMS {
    public static void main(String[] args) {

        
        System.out.println("************************************<<-----------MAIN MENU-------->>******************************************************");
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("\t \t \t \t   Welcome to the Hospital Management System! ");
        System.out.println(" \t \t \t\t \tEnter 1 to enter Patient's menu \n \t \t \t\t \tEnter 2 to enter Doctor's Menu");
        System.out.println(" \t \t \t \t \t \t \t \t  \t \t \t");
        int response = sc.nextInt();

        patient[] p = new patient[50];
        p[0] = new patient();
        p[0].name = "Shreyas Nikam";
        p[0].disease = "Stomach ache";
        p[0].Gender = "Male";
        p[0].age = 16;
        p[0].Room = "E1";
        p[1] =new patient(); 
        p[1].name = "Anmol Chondhe";
        p[1].disease = "Diarrhea";
        p[1].Gender = "Male";
        p[1].age = 16;
        p[1].Room = "E3";
        
        p[2] = new patient(); 
        p[2].name = "Ajinkya Deshpande"; 
        p[2].disease = "Maleria"; 
        p[2].age =24; 
        p[2].Gender = "Male"; 
        p[2].Room = "E2"; 

       doctor[] d= new doctor[15];
       
       d[0] = new doctor(); 
       d[0].name = "Shreyas Nikam"; 
       d[0].speciality = "Cancer" ; 
       d[0].Room = "B5"; 

       d[1] = new doctor(); 
       d[1].name = "Amol Kondhe"; 
       d[1].speciality = "ENT" ; 
       d[1].Room = "B2";

       d[2] = new doctor(); 
       d[2].name = "Amit Sharma"; 
       d[2].speciality = "Paeditrician" ; 
       d[2].Room = "A2";

       d[3] = new doctor(); 
       d[3].name = "Bhaskar Yadav"; 
       d[3].speciality = "Ayurveda" ; 
       d[3].Room = "A1";

        switch(response){
            case 1:{
                               System.out.println("************************************<<-----------PATIENT MENU-------->>******************************************************");
                System.out.println("\t \t \t \t \t 1. Patient Records.(enter 1) ");
                System.out.println("\t \t \t \t \t 2. New Entry.(enter 2)");
                int response1 = sc.nextInt();
               
                switch(response1){
                    case 1: { // Patient Records
                          while(response1 == 1){
                            try{
                                System.out.println("Name \t \t \t \t \t Disease \tGender \tRoom \tAge");
                                
                                System.out.println(p[0].name +"\t \t \t \t "+ p[0].disease +"\t"+ p[0].Gender +"\t"+ p[0].Room +"\t"+ p[0].age);
                                System.out.println(p[1].name +"\t \t \t \t "+ p[1].disease +"\t"+ p[1].Gender +"\t"+ p[1].Room +"\t"+ p[1].age);
                                System.out.println(p[2].name +"\t \t \t"+ p[2].disease +"\t \t"+ p[2].Gender +"\t"+ p[2].Room +"\t"+ p[2].age);
                               
                                System.out.println("ENTER 0 TO EXIT");
                                response1 = sc.nextInt();   
                                 
                            }//try
                            catch(Exception f){
                                ;
                            }

                          }
                    }
               
                    case 2 :{
                        while(response1 == 2) {
                            try
                            {
                                 p[response].ask_info();
                                 System.out.println("do you wishe to continue : enter 2 ");
                                 System.out.println("ENTER 0 TO EXIT");
                                 response1= sc.nextInt();       
                            
                             } 
                             catch(Exception e){
                                 ;
                             }                    
                     }
                    }
                }
            }
                
            
            case 2 :{
                while(response == 2)
                {System.out.println("************************************<<-----------DOCTOR'S MENU -------->>******************************************************");
                 System.out.println(" \t \t \t \t \tEnter 1 to view Doctor's List\n");
                int response_d = sc.nextInt(); 
                System.out.println("\t \t Doctor's list\n");
                switch(response_d){
                    case 1 : {
                        try{
                            System.out.println("Name \t \t \tRoom \tSpeciality");
                            for(int f= 0 ; f <= d.length ; f++){
                                System.out.println(d[f].name +"\t \t" + d[f].Room+"\t" + d[f].speciality);
                            }}
                            catch(Exception e){
                                ;
                            }
                            System.out.println("\nEnter 0 to exit\nEnter 2 to return to Doctor's menu ");
                            response = sc.nextInt();
                             }

                    }
                }
               
            }
    }
}//psvm
}//public class 
