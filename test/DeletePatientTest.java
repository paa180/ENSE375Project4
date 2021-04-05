package com.uregina.app;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.Test;
//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import java.util.ArrayList;

public class DeletePatientTest {
    private ArrayList<String> list;
    private Patient patient;
    private PatientList patientList;

    @Before
    public void addPatient() {
        list = new ArrayList<String>();
        patientList = new PatientList();
        try {
            PostalCode code = new PostalCode("K1B-4J2");
            patient = new Patient("john", "1", 24, code);
        } catch (Exception e) {

        }
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void deletePatient_true() {
        PatientList patientList = new PatientList();
        patientList.addPatient(patient);
        assertEquals(1, patientList.getNumberofPatients());
        patientList.deletePatient(0);
        assertNull(patientList.getPatient("1"));
    }

    @Test
    public void getCount_true() {
        PatientList patientList = new PatientList();
        patientList.addPatient(patient);
        patientList.addPatient(patient);
        patientList.deletePatient(1);
        assertEquals(1, patientList.getNumberofPatients());
    }

    @Test
    public void getCount_false() {
        PatientList patientList = new PatientList();
        patientList.addPatient(patient);
        patientList.addPatient(patient);
        patientList.deletePatient(1);
        assertNotEquals(2, patientList.getNumberofPatients());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void deletePatient_False() {
        // PatientList patientList = new PatientList();
        patientList.addPatient(patient);
        patientList.addPatient(patient);
        patientList.deletePatient(1);
        patientList.deletePatient(0);
        boolean result = patientList.deletePatient(0);
        // patientList.deletePatient(2);
        assertFalse(result);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void invalidIndex() {
        // PatientList patientList = new PatientList();
        patientList.addPatient(patient);
        patientList.addPatient(patient);
        patientList.deletePatient(1);
        patientList.deletePatient(0);
        boolean result = patientList.deletePatient(-1);
        // patientList.deletePatient(2);
        assertFalse(result);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveWithEmptyList() {
        patientList.deletePatient(1);
    }

}