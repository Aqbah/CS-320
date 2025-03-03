package Contact;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Contact.Contact;
import Contact.ContactService;

@SuppressWarnings("unused")
public class ContactTest {

	@Test
	public void testValContCreate() {
		Contact cont = new Contact("Aqbah", "Butt", "0302840555", "264 Main Blv");
		assertNotNull(cont.getContId());
		assertTrue(cont.getContId().length() == 10);
		assertEquals("Aqbah", cont.getFName());
		assertEquals("Butt", cont.getLName());
		assertEquals("0302840555", cont.getNo());
		assertEquals("264 Main Blv", cont.getAddr());
	}
	
	@Test
	public void testInvalFName() {
		Exception exc = assertThrows(IllegalArgumentException.class, () -> {
			new Contact (null, "Butt", "0302840555", "264 Main Blv");
			});
		assertTrue(exc.getMessage().contains("First Name"));
	}
	
	@Test
	public void testInvalLName() {
		Exception exc = assertThrows(IllegalArgumentException.class, () -> {
			new Contact ("Aqbah", null, "0302840555", "264 Main Blv");
			});
		assertTrue(exc.getMessage().contains("Last Name"));
	}
	
	@Test
	public void testInvalNo() {
		Exception exc = assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Aqbah", "Butt", "05553", "264 Main Blv");
		});
		assertTrue(exc.getMessage().contains("Phone"));
	}
	
	@Test
	public void testInvalAddr() {
			String addrLong = "This address exceeds the thirty characters limit so it must be invalid and an exception should be thrown.";
			Exception exc = assertThrows(IllegalArgumentException.class, () -> {
				new Contact("Aqbah", "Butt", "0302840555", addrLong);
			});
			assertTrue(exc.getMessage().contains("Address"));
	}
	
	@Test
	public void testSetters() {
		Contact cont = new Contact ("Aqbah", "Butt", "0302840555", "264 Main Blv");
		cont.setFName("Aqbah");
		cont.setLName("Butt");
		cont.setNo("5550482030");
		cont.setAddr("846 CC St");
		assertEquals("Aqbah", cont.getFName());
		assertEquals("Butt", cont.getLName());
		assertEquals("5550482030", cont.getNo());
		assertEquals("846 CC St", cont.getAddr());
	}
}