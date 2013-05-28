package net.ciklum.study.Map;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

/**
 * Created with IntelliJ IDEA.
 * User: John
 * Date: 5/27/13
 * Time: 7:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class TimeMapTest {
    public TimeMap timeMap = new TimeMap();

    @Test
    public void testPut() throws Exception {
        timeMap.put(1,"First");
        timeMap.put(2,"Second");
        timeMap.put(3,"Third");
        assertEquals("First",timeMap.get(1));
        assertEquals("Second",timeMap.get(2));
        assertEquals("Third",timeMap.get(3));
    }
    @Test
    public void testGet() throws Exception{
        timeMap.put(1,"First");
        timeMap.put(2,"Second");
        timeMap.put(3,"Third");
        assertEquals("First",timeMap.get(1));
        Thread.sleep(6000);
        assertNull(timeMap.get(2));
        assertNull(timeMap.get(3));

    }

}
