package conference;

import java.util.Scanner;

public class bookingmanagement {
    public String customerPhone;
    private String customerName;
    private String date;
    private String roomType;
    public bookingmanagement(){
        this.customerPhone="0999999999";
        this.customerName="Bunhai";
        this.date="01/01/2024";
        this.roomType="VIP";
    }
    public bookingmanagement(String customerPhone, String customerName, String date, String roomType){
        this.customerPhone=customerPhone;
        this.customerName=customerName;
        this.date=date;
        this.roomType=roomType;
    }
    public String getCustomerPhone(){return customerPhone;}
    public String getCustomerName(){return customerName;}
    public String getDate(){return date;}
    public String getRoomType(){return roomType;}

    public void setCustomerPhone(String customerPhone){this.customerPhone=customerPhone;}
    public void setCustomerName(String customerName){this.customerName=customerName;}
    public void setDate(String date){this.date=date;}
    public void setRoomType(String roomType){this.roomType=roomType;}
    public void input(){
        Scanner input=new Scanner(System.in);
        int n=0;
            System.out.print("Input phone :");
            customerPhone= input.next();
            System.out.print("Input name :");
            customerName= input.next();
            System.out.print("Input date :");
            date=input.next();
            System.out.print("Input room type :");
            roomType= input.next();
            System.out.println("------------------------");
                }
                //Report of all Booking
    public void output(){
        System.out.printf("|%-10s|%-20s|%-15s|%-15s|%n",customerPhone,customerName,date,roomType);
        System.out.printf("|____________________________________________________________________________________________|%n");
    }
    //manu1;

    public void manu1(){
        System.out.println("===============Booking Management============");
        System.out.println("[1].Booking Management");
        System.out.println("[2].Room    Management");
        System.out.println("[3].Report of all Booking");
        System.out.println("[4].Report of all Rooms");
        System.out.println("[0].Exit...");
        System.out.println("==============================================");
    }
    //manu booking management;
    public void manubookingmanagement(){
        System.out.println("------------------------------");
        System.out.println("1.Add  Booking Information");
        System.out.println("2.Edit Booking Information");
        System.out.println("3.Listing of Booking Type");
        System.out.println("4.Deleting the Booking type");
        System.out.println("0.Back To Home Page");
        System.out.println("------------------------------");
    }
    public void loginSystem(){
        Scanner input=new Scanner(System.in);
        String username="dre11";
        String password="pass11";
        int count=0;
        while(true){
            System.out.print("Enter Username:");
            String enterUserName=input.next();
            System.out.print("Enter Password:");
            String enterPassword=input.next();
            if(enterUserName.equals(username) && enterPassword.equals(password)){
                System.out.println("Login Success..");
                break;
            }else {
                count+=1;
                if(enterUserName.equals(username)){
                    System.out.println("Wrong password!");
                }else if(enterPassword.equals(password)){
                    System.out.println("Wrong user name!");
                }else
                System.out.println("Wrong user name and password!");
            }
            if(count==3){
                System.out.println("You have input incorrect user name and password 3 times!");
                System.exit(0);
            }
        }

    }
    public void bookingTypeVip(bookingmanagement[] bookings, int n){
        for(int k=0;k<n;k++){
            if(bookings[k].getRoomType().equalsIgnoreCase("vip")){
                output();
            }
        }
    }
    public void bookingTypeMini(bookingmanagement[] bookings, int n){
        for(int f=0;f<n;f++){
            if(bookings[f].getRoomType().equalsIgnoreCase("mini")){
                output();
            }
        }
    }
    public void  Update(bookingmanagement[] bookings, int n) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input phone or name to edit:");
        String upInfo= in.next();
        String upCustomerPhone;
        String upCustomerName;
        String upDateTime;
        String upRoomType;
        int b = 0;
        for (int i = 0; i < n; i++) {
            if (bookings[i].getCustomerPhone().equals(upInfo) || bookings[i].getCustomerName().equals(upInfo)) {
                b = 1;
                System.out.print("Input phone :");
                upCustomerPhone= in.next();
                System.out.print("Input name :");
                upCustomerName= in.next();
                System.out.print("Input date :");
                upDateTime=in.next();
                System.out.print("Input room type :");
                upRoomType= in.next();
                System.out.println("------------------------");

                bookings[i].setCustomerPhone(customerPhone);
                bookings[i].setCustomerName(customerName);
                bookings[i].setDate(date);
                bookings[i].setRoomType(roomType);
                //System.clearProperty(String.valueOf(b));

            }
        }
        if (b == 0) {
            System.out.println("Information not match!");
        }
    }

}
