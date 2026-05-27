package hrs.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Room {
private int id ;
private int roomNumber;
private String roomType;
private double price;
private String status;

public Room(int roomNumber, String roomType, double price, String status) {
	super();
	this.roomNumber = roomNumber;
	this.roomType = roomType;
	this.price = price;
	this.status = status;
}


}
