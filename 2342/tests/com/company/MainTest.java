package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void add() {
        assertEquals(Main.add(5, 3), 5 + 3);
    }
    @Test
    public void addFirstNegativ() {
        assertEquals(Main.add(-5, 3), -5 + 3);
    }
    @Test
    public void addSecondNegativ() {
        assertEquals(Main.add(5, -3), 5 + (-3));
    }
    @Test
    public void addTwoNegativ() {
        assertEquals(Main.add(-5, -3), -5 + (-3));
    }
    @Test
    public void addFirstZero() {
        assertEquals(Main.add(0, 3), 0 + 3);
    }
    @Test
    public void addSecondZero() {
        assertEquals(Main.add(5, 0), 5 + 0);
    }
    @Test
    public void addTwoZero() {
        assertEquals(Main.add(0, 0), 0 + 0);
    }
    @Test
    public void sub() {
        assertEquals(Main.sub(5, 3), 5 - 3);
    }
    @Test
    public void subFirstNegativ() {
        assertEquals(Main.sub(-5, 3), -5 - 3);
    }
    @Test
    public void subSecondNegativ() {
        assertEquals(Main.sub(5, -3), 5 - (-3));
    }
    @Test
    public void subTwoNegativ() {
        assertEquals(Main.sub(-5, -3), -5 - (-3));
    }
    @Test
    public void subFirstZero() {
        assertEquals(Main.sub(0, 3), 0 - 3);
    }
    @Test
    public void subSecondZero() {
        assertEquals(Main.sub(5, 0), 5 - 0);
    }
    @Test
    public void subTwoZero() {
        assertEquals(Main.sub(0, 0), 0 - 0);
    }
    @Test
    public void div() {
        assertEquals(Main.div(5, 3), 5 / 3);
    }
    @Test
    public void divFirstNegativ() {
        assertEquals(Main.div(-5, 3), -5 / 3);
    }
    @Test
    public void divSecondNegativ() {
        assertEquals(Main.div(5, -3), 5 / (-3));
    }
    @Test
    public void divTwoNegativ() {
        assertEquals(Main.div(-5, -3), -5 / (-3));
    }
    @Test
    public void divFirstZero() {
        assertEquals(Main.div(0, 3), 0 / 3);
    }
    @Test
    public void remains() {
        assertEquals(Main.remains(5, 3), 5 % 3);
    }
    @Test
    public void remainsFirstNegativ() {
        assertEquals(Main.remains(-5, 3), -5 % 3);
    }
    @Test
    public void remainsSecondNegativ() {
        assertEquals(Main.remains(5, -3), 5 % (-3));
    }
    @Test
    public void remainsTwoNegativ() {
        assertEquals(Main.remains(-5, -3), -5 % (-3));
    }
    @Test
    public void remainsFirstZero() {
        assertEquals(Main.remains(0, 3), 0 % 3);
    }
    @Test
    public void multiply() {
        assertEquals(Main.multiply(5, 3), 5 * 3);
    }
    @Test
    public void multiplyFirstNegativ() {
        assertEquals(Main.multiply(-5, 3), -5 * 3);
    }
    @Test
    public void multiplySecondNegativ() {
        assertEquals(Main.multiply(5, -3), 5 * (-3));
    }
    @Test
    public void multiplyTwoNegativ() {
        assertEquals(Main.multiply(-5, -3), -5 * (-3));
    }
    @Test
    public void multiplyFirstZero() {
        assertEquals(Main.multiply(0, 3), 0 * 3);
    }
    @Test
    public void multiplySecondZero() {
        assertEquals(Main.multiply(5, 0), 5 * 0);
    }
    @Test
    public void multiplyTwoZero() {
        assertEquals(Main.multiply(0, 0), 0 - 0);
    }
    @Test
    public void degree() {
        assertEquals(5,3, Math.pow(5,3));
    }

    @Test
    public void degreeTwoZero() {
        assertEquals(0,0, Math.pow(0,0));
    }
    @Test
    public void main() {
    }
}