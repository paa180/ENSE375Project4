package com.uregina.app;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import java.util.ArrayList;



public class PatientListTest {
	private ArrayList<String> list;
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
	
	@Before
	public void addPatient(){
		list = new ArrayList<String>();
	}
	
	@Test
	public void testListInit(){
		assertTrue(list.isEmpty());
		assertTrue(list.size() == 0);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testInvalidCapacity(){
		list = new ArrayList<String>(-1);
	}
	
	@Test
	public void testAddPatient(){
		list.add(0, "Patient");
		assertEquals("Patient", list.get(0));
		assertTrue(list.size() == 1);
	}
	
	
	@Test
	public void addPatientFirstName(){
		list.add(0, "firstName");
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
	}
	

	@Test
	public void addPatientLastName(){
		list.add(0, "lastName");
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
	}

	@Test		
    public void addPatientAge() {					
        list.add(0, "Age");					
        assertFalse(list.isEmpty());			
        assertEquals(1, list.size());			
    }	

	
	@Test
	public void addPatientAddress(){
		list.add(0, "Address");
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
	}

	@Test
	public void addPostalCode(){
		list.add(0, "PostalCode");
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
	}


	@Test
	public void addHealthCard(){
		list.add(0, "HealthCard");
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
	}
	@Test
	public void addCity(){
		list.add(0, "City");
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
	}

	@Test
	public void addCell(){
		list.add(0, "cellPhone");
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
	}

	@Test 
	(expected = IndexOutOfBoundsException.class)
	public void testRemoveWithEmptyList(){
		list.remove(1);
	}

}
