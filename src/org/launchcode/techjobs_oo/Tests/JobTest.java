package org.launchcode.techjobs_oo.Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;

import static org.junit.Assert.assertNotEquals;

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
}
