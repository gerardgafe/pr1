package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR1QueueTest {

    PR1Queue pr1q;
    Funcion func;

    private void fillQueue() {
        for (int x = 1; x <= 15; x++) {
            pr1q.add(func.calcularFuncion(x));
        }
    }

    @Before
    public void setUp() {
        this.pr1q = new PR1Queue();
        this.func = new Funcion();

        assertNotNull(this.pr1q.getQueue());
        fillQueue();
    }

    @After
    public void release() {
        this.pr1q = null;
    }


    @org.junit.Test
    public void queueTest() {
        assertEquals(this.pr1q.CAPACITY, this.pr1q.getQueue().size());

        Assert.assertEquals('1', pr1q.poll(), 0);
        Assert.assertEquals('4', pr1q.poll(), 0);
        Assert.assertEquals('9', pr1q.poll(), 0);
        Assert.assertEquals('0', pr1q.poll(), 0);
        Assert.assertEquals('1', pr1q.poll(), 0);
        Assert.assertEquals('4', pr1q.poll(), 0);
        Assert.assertEquals('9', pr1q.poll(), 0);
        Assert.assertEquals('0', pr1q.poll(), 0);
        Assert.assertEquals('1', pr1q.poll(), 0);
        Assert.assertEquals('4', pr1q.poll(), 0);
        Assert.assertEquals('9', pr1q.poll(), 0);
        Assert.assertEquals('0', pr1q.poll(), 0);
        Assert.assertEquals('1', pr1q.poll(), 0);
        Assert.assertEquals('4', pr1q.poll(), 0);
        Assert.assertEquals('9', pr1q.poll(), 0);

        assertEquals(0, this.pr1q.getQueue().size());

    }

}
