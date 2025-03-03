package Contact;

import Contact.Contact;
import Contact.ContactService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
public class ContactServiceTest{
	private ContactService contServ;
	private Contact cont;
	
	@BeforeEach
	public void setUp() {
		contServ = new ContactService();
		//Creating a VALID contact and adding it to the service
		cont = new Contact("Aqbah", "Butt", "0302840555", "264 Main Blv");
		contServ.addCont(cont);
	}
	
	@Test
	public void testAddnGetCont() {
		Contact contactGot = contServ.getCont(cont.getContId());
		assertNotNull(contactGot);
		assertEquals("Aqbah", contactGot.getFName());
	}
	
	@Test
	public void testDupeCont() {
		Exception exc = assertThrows(IllegalArgumentException.class, () -> contServ.addCont(cont));
		assertTrue(exc.getMessage().contains("unique"));
	}
	
	@Test
	public void testDelCont() {
		contServ.delCont(cont.getContId());
		assertNull(contServ.getCont(cont.getContId()));
	}
	
	@Test
	public void testDelContNonExist() {
		Exception exc = assertThrows(IllegalArgumentException.class, () -> contServ.delCont("nonexistent"));
		assertTrue(exc.getMessage().contains("not be found"));
	}
	
	@Test
	public void testUpdateFName() {
		contServ.updateFName(cont.getContId(), "Aqbah");
		assertEquals("Aqbah", contServ.getCont(cont.getContId()).getFName());
	}
	@Test
	public void testUpdateLName() {
		contServ.updateLName(cont.getContId(), "Butt");
		assertEquals("Butt", contServ.getCont(cont.getContId()).getLName());
	}
	
	@Test
	public void testUpdateNo() {
		contServ.updateNo(cont.getContId(), "5550482030");
		assertEquals("5550482030", contServ.getCont(cont.getContId()).getNo());
	}
	
	@Test
	public void testUpdateAddr() {
		contServ.updateAddr(cont.getContId(), "846 CC St");
		assertEquals("846 CC St", contServ.getCont(cont.getContId()).getAddr());
	}
}