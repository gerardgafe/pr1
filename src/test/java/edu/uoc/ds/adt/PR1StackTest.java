package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR1StackTest {

    PR1Stack pr1s;
    Funcion func;

    private void fillStack() {
        for (int x = 1; x <= 15; x++) {
            pr1s.push(func.calcularFuncion(x));
        }
    }

    @Before
    public void setUp() {
        this.pr1s = new PR1Stack();
        this.func = new Funcion();

        assertNotNull(this.pr1s.getStack());
        this.fillStack();

    }

    @After
    public void release() {
        this.pr1s = null;
    }


    @org.junit.Test
    public void stackTest() {
        assertEquals(this.pr1s.CAPACITY, this.pr1s.getStack().size());

        Assert.assertEquals('9', pr1s.pop(), 0);
        Assert.assertEquals('4', pr1s.pop(), 0);
        Assert.assertEquals('1', pr1s.pop(), 0);
        Assert.assertEquals('0', pr1s.pop(), 0);
        Assert.assertEquals('9', pr1s.pop(), 0);
        Assert.assertEquals('4', pr1s.pop(), 0);
        Assert.assertEquals('1', pr1s.pop(), 0);
        Assert.assertEquals('0', pr1s.pop(), 0);
        Assert.assertEquals('9', pr1s.pop(), 0);
        Assert.assertEquals('4', pr1s.pop(), 0);
        Assert.assertEquals('1', pr1s.pop(), 0);
        Assert.assertEquals('0', pr1s.pop(), 0);
        Assert.assertEquals('9', pr1s.pop(), 0);
        Assert.assertEquals('4', pr1s.pop(), 0);
        Assert.assertEquals('1', pr1s.pop(), 0);

        assertEquals(0, this.pr1s.getStack().size());
    }
}
