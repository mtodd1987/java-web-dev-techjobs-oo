package org.launchcode.techjobs_oo.Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    public Job A;
    public Job B;

    @Before
    public void Jobs() {
       A = new Job();
       B = new Job();
    }
    @Test
    public void testSettingJobId() {
    assertNotEquals(A.getId(), B.getId());
}

    @Test
    public void testJobConstructorSetsAllFields() {
        Job productTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", productTester.getName());
        assertEquals("ACME", productTester.getEmployer().getValue());
        assertEquals("Desert", productTester.getLocation().getValue());
        assertEquals("Quality Control", productTester.getPositionType().getValue());
        assertEquals("Persistence", productTester.getCoreCompetency().getValue());
        }
     @Test
    public void testJobsForEquality(){
         Job productTester1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
         Job productTester2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
         assertNotEquals(productTester1, productTester2);
     }
    @Test
    public void testForToString(){
        assertTrue(B.toString().contains("ID"));
        assertTrue(B.toString().contains("Name"));
        assertTrue(B.toString().contains("Employer"));
        assertTrue(B.toString().contains("Location"));
        assertTrue(B.toString().contains("Position Type"));
        assertTrue(B.toString().contains("Core Competency"));
    }
    @Test
    public void testForNull(){
        assertTrue(B.toString().contains("Data Not Available"));
    }
}
