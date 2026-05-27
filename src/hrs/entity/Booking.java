package hrs.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Booking {
private int id ;
private String customerName;
private int roomId;
private Date checkIn;
private Date checkOut;

public Booking(String customerName, int roomId, Date checkIn, Date checkOut) {
	super();
	this.customerName = customerName;
	this.roomId = roomId;
	this.checkIn = checkIn;
	this.checkOut = checkOut;
}



}
