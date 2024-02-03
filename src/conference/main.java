package conference;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=0,op1,op2;
        String st1,st2;
        // this is ravin

        boolean exit=false;
        bookingmanagement b1=new bookingmanagement();//for manu
        b1.loginSystem();
        bookingmanagement[] bookings=new bookingmanagement[100000];
        //
       do{
           b1.manu1();
           System.out.print("which one do you want choose:");
           op1=input.nextInt();
           switch (op1){
               //Booking Management;
               case 1:{
                   do{
                       b1.manubookingmanagement();
                       System.out.print("Pls Choose One:");
                       op2=input.nextInt();
                       switch(op2){
                           //add booking information;
                           case 1:{
                               System.out.print("Input N:");
                               n=input.nextInt();
                               int i;
                               for(i=0;i<n;i++){
                                   bookings[i]=new bookingmanagement();
                                   bookings[i].input();
                               }
                               System.out.print("Enter [any key] To Continues...");
                           }break;
                           //edit booking information;
                           case 2:{
                               bookingmanagement b = new bookingmanagement();
                               b.Update(bookings, n);
//                                   Update(bookings,n);
                               System.out.print("Enter [any key] To Continues...");
                           }break;
                           //listing of booking type;
                           case 3:{

                               System.out.print("Enter [any key] To Continues...");
                           }break;
                           //deleting the booking type;
                           case 4:{

                               System.out.print("Enter [any key] To Continues...");
                           }break;
                           case 5:{
                               System.out.print("Enter [any key] To Continues...");

                           }break;
                           case 0 :{
                               System.out.println("Typing exit:");

                           }break;
                           default:{
                               System.out.println("Invalid choice...");
                           }
                       }
                       st1=input.next();
                   }while(!st1.equals("exit") );
               }break;
               //Room Management;
               case 2:{

               }break;
               //Report of all Booking;
               case 3:{
                   System.out.printf("|--------------------------------------------------------------------------------------------|%n");
                   System.out.printf("|%-10s|%-20s|%-15s|%-15s|%-12s|%-15s|%n","Room_ID","Customer_ID","Customer_Name","Customer_Gender","Room_Number","Room_Date");
                   System.out.printf("|____________________________________________________________________________________________|%n");
                    for (int i=0;i<n;i++){
                        bookings[i].output();
                    }
               }break;
               //Report of all Rooms
               case 4:{

               }break;
               case 0:{
                   System.exit(0);
               }
           }
           System.out.println(" ");
           System.out.print("press [any key] to continues:");
           st2=input.next();
       }while(!st2.equals("exit"));
    }
}

