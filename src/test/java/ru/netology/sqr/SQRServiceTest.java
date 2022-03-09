package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void calculateRangeThreeNumber() {
        SQRService service = new SQRService();
        int min = 200;
        int max = 300;
        int expected = 3;
        int actual = service.calculate(min, max);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMaxRange() {
        SQRService service = new SQRService();
        int min = 9900;
        int max = 10_000;
        int expected = 0;
        int actual = service.calculate(min, max);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMinRange() {
        SQRService service = new SQRService();
        int min = 10;
        int max = 99;
        int expected = 0;
        int actual = service.calculate(min, max);
        assertEquals(expected, actual);
    }
}