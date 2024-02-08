package conference;

import java.util.Scanner;

public class bookingmanagement {
    public String room_id;
    private String customer_id;
    private String customer_name;
    private String customer_gender;
    private int room_number;
    private String room_date;
    public bookingmanagement(){
        this.room_id="room1122";
        this.customer_id="Ravin1122";
        this.customer_name="Ravin";
        this.customer_gender="male";
        this.room_number=101;
        this.room_date="2024-01-23";
    }
    public bookingmanagement(String room_id, String customer_id, String customer_name, String customer_gender, int room_number, String room_date){
        this.room_id=room_id;
        this.customer_id=customer_id;
        this.customer_name=customer_name;
        this.customer_gender=customer_gender;
        this.room_number=room_number;
        this.room_date=room_date;
    }

    public String getRoom_id() {
        return room_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getCustomer_gender() {
        return customer_gender;
    }

    public int getRoom_number() {
        return room_number;
    }

    public String getRoom_date() {
        return room_date;
    }

    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setCustomer_gender(String customer_gender) {
        this.customer_gender = customer_gender;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    public void setRoom_date(String room_date) {
        this.room_date = room_date;
    }
    //Input Information;
    public void input(){
        Scanner input=new Scanner(System.in);
        int n=0;
        System.out.print("Input Room_ID        :");
        room_id= input.next();
        System.out.print("Input Customer_ID    :");
        customer_id= input.next();
        System.out.print("Input Customer_Name  :");
        customer_name=input.nextLine();
        customer_name= input.nextLine();
        System.out.print("Input Customer_Gender:");
        customer_gender = input.next();
        System.out.print("Input Room_Number    :");
        room_number= input.nextInt();
        System.out.print("Input Room_Date      :");
        room_date = input.next();
        System.out.println("------------------------");
    }
    //Report of all Booking
    public void output(){
        System.out.printf("|%-10s|%-20s|%-15s|%-15s|%-12s|%-15s|%n",room_id,customer_id,customer_name,customer_gender,room_number,room_date);
        System.out.printf("|____________________________________________________________________________________________|%n");
    }
    //manu1;
    public void manu1(){
        System.out.println("===============Booking Management============");
        System.out.println("1.Booking Management");
        System.out.println("2.Room    Management");
        System.out.println("3.Report of all Booking");
        System.out.println("4.Report of all Rooms");
        System.out.println("0.Exit...");
    }
    //manu booking management;
    public void manubookingmanagement(){
        System.out.println("1.Add  Booking Information");
        System.out.println("2.Edit Booking Information");
        System.out.println("3.Listing of Booking Type");
        System.out.println("4.Deleting the Booking type");
        System.out.println("0.Back To Home Page");
    }
    //LoginSystem
    public void loginSystem(){
        Scanner input=new Scanner(System.in);
        String username="dre11";
        String password="pass11";
        System.out.print("Enter Username:");
        String enterusername=input.next();
        System.out.print("Enter Password:");
        String enterpassword=input.next();
        if(enterusername.equals(username) && enterpassword.equals(password)){
            System.out.println("Login Success..");
        }else {
            System.out.println("Fail..");
            System.exit(0);
        }
    }
    public void  Update(bookingmanagement[] bookings, int n) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Room ID to edit:");
        String e_roomid = in.next();
        String uproom_id;
        String upcustomer_id;
        String upcustomer_name;
        String upcustomer_gender;
        int uproom_number;
        String uproom_date;
        int b = 0;
        for (int i = 0; i < n; i++) {
            if (bookings[i].getRoom_id().equals(e_roomid)) {
                b = 1;
                System.out.print("Input New Room_ID        :");
                uproom_id = in.next();
                System.out.print("Input New Customer_ID    :");
                upcustomer_id = in.next();
                System.out.print("Input New Customer_Name  :");
                upcustomer_name = in.next();
                System.out.print("Input New Customer_Gender:");
                upcustomer_gender = in.next();
                System.out.print("Input New Room_Number    :");
                uproom_number = in.nextInt();
                System.out.print("Input New Room_Date      :");
                uproom_date = in.next();

                bookings[i].setRoom_id(uproom_id);
                bookings[i].setCustomer_id(upcustomer_id);
                bookings[i].setCustomer_name(upcustomer_name);
                bookings[i].setCustomer_gender(upcustomer_gender);
                bookings[i].setRoom_number(uproom_number);
                bookings[i].setRoom_date(uproom_date);
                System.clearProperty(String.valueOf(b));

            }
        }
        if (b == 0) {
            System.out.println("invalid room id");
        }
    }

}