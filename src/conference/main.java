package conference;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=0,op1,op2;
        String st1,st2;
        boolean exit=false;
        bookingmanagement b1=new bookingmanagement();//for manu
        b1.loginSystem();
        bookingmanagement[] bookings=new bookingmanagement[100000];
       do{
           b1.manu1();
           System.out.print("Choose your main function : ");
           op1=input.nextInt();
           switch (op1){
               case 1:{
                       b1.manubookingmanagement();
                       System.out.print("Pls Choose One:");
                       op2=input.nextInt();
                       switch(op2){
                           case 1:{
                               System.out.println("==========Input Information===========");
                               System.out.print("Input N:");
                               n=input.nextInt();
                               int i;
                               for(i=0;i<n;i++){
                                   bookings[i]=new bookingmanagement();
                                   bookings[i].input();
                               }
                           }break;
                           case 2:{
                               System.out.println("==========Edit Information===========");
                               bookingmanagement b = new bookingmanagement();
                               b.Update(bookings, n);
                               //Update(bookings,n);
                           }break;
                           case 3:{
                               System.out.println("==========Listing Booking Type===========");
                               bookingmanagement b = new bookingmanagement();
                               b.bookingTypeVip(bookings,n);
                               System.out.println(" ");
                               b.bookingTypeMini(bookings,n);
                           }break;
                           case 4:{

                               System.out.print("==========Deleting of Booking Type===========");
                           }break;

                           case 0 :{
                               System.out.println("Typing exit:");

                           }break;
                           default:{
                               System.out.println("Invalid choice...");
                           }
                       }

               }break;
               case 2:{

               }break;
               //Report of all Booking;
               case 3:{
                   System.out.printf("|--------------------------------------------------------------------------------------------|%n");
                   System.out.printf("|%-10s|%-20s|%-15s|%-15s|%n","Telephone","CustomerName","RoomType","BookingDate");
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
       System.out.println("Thank for using our service!");
    }
}

