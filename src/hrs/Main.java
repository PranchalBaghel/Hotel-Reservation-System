package hrs;

import hrs.DAO.HotelDAO;
import hrs.controller.HotelController;
import hrs.view.HotelView;

public class Main {
	public static void main(String[] args) {
		HotelDAO dao = new HotelDAO();
		HotelView view = new HotelView();
		HotelController controller = new HotelController(dao,view);
		controller.run();
	}
}
