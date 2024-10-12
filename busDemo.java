package BusResv;
import java.util.Scanner;
import java.sql.SQLException;
import java.util.ArrayList;
public class busDemo{
public static void main(String[] args){

	BusDAO busdao = new BusDAO();
	
	try {
	
	busdao.displayBusInfo();
	
	int userOpt = 1;
	Scanner scanner = new Scanner(System.in);
    while(userOpt==1) {
		System.out.println("Enter 1 to BOOK 2 to exit");
		userOpt = scanner.nextInt();
		if(userOpt == 1) {
			Booking booking = new Booking();
			if(booking.isAvailable()) {
				BookingDAO bookingdao = new BookingDAO();
				bookingdao.addBooking(booking);
				
				
				System.out.println("Your booking is conformed .... Happy journey...");
			}
			else {
				System.out.println("Sorry,try another bus else another date ...");
				
			}
			
		}
		}
    scanner.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}

}
