package Contact;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
	private final Map<String, Contact> conts = new HashMap<>();
	
	public void addCont(Contact cont) {
		if (cont == null) {
			throw new IllegalArgumentException("Contact field cannot be empty or null!");
		}
		if (conts.containsKey(cont.getContId())) {
			throw new IllegalArgumentException("Contacts must use unique IDs!");
		}
		conts.put(cont.getContId(), cont);
	}
	
	public Contact getCont(String contId) {
		return conts.get(contId);
	}
	
	public void delCont(String contId) {
		if (!conts.containsKey(contId)) {
			throw new IllegalArgumentException("Contact ID could not be found!");
		}
		conts.remove(contId);
	}
	
	//Following are the update methods for fields which are updatable
	public void updateFName(String contId, String fName) {
		Contact cont = conts.get(contId);
		if(cont == null) {
			throw new IllegalArgumentException("Contact ID could not be found!");
		}
		cont.setFName(fName);
	}
	
	public void updateLName(String contId, String lName) {
		Contact cont = conts.get(contId);
		if(cont == null) {
			throw new IllegalArgumentException("Contact ID could not be found!");
		}
		cont.setLName(lName);
	}
	
	public void updateNo(String contId, String phone) {
		Contact cont = conts.get(contId);
		if(cont == null) {
			throw new IllegalArgumentException("Contact ID could not be found!");
		}
		cont.setNo(phone);
	}
	
	public void updateAddr(String contId, String address) {
		Contact cont = conts.get(contId);
		if (cont == null) {
			throw new IllegalArgumentException("Contact ID could not be found!");
		}
		cont.setAddr(address);
	}
}