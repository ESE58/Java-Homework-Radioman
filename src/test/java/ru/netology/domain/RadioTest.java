package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldCheckStationIsMinus1() {
        Radio rd = new Radio();

        rd.setCurrentStation(-1);

        int expected = 0;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckStationIs0() {
        Radio rd = new Radio();

        rd.setCurrentStation(0);

        int expected = 0;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckStationIs1() {
        Radio rd = new Radio();

        rd.setCurrentStation(1);

        int expected = 1;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckStationIs8() {
        Radio rd = new Radio();

        rd.setCurrentStation(8);

        int expected = 8;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldCheckStationIs9() {
        Radio rd = new Radio();

        rd.setCurrentStation(9);

        int expected = 9;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckStationIs10() {
        Radio rd = new Radio();

        rd.setCurrentStation(10);

        int expected = 0;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckNextStationCurrentIs0() {
        Radio rd = new Radio();
        rd.setCurrentStation(0);

        rd.nextStation();

        int expected = 1;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckNextStationCurrentIs9() {
        Radio rd = new Radio();
        rd.setCurrentStation(9);

        rd.nextStation();

        int expected = 0;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckPreviousStationCurrentIs0() {
        Radio rd = new Radio();
        rd.setCurrentStation(0);

        rd.prevStation();

        int expected = 9;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckPreviousStationCurrentIs9() {
        Radio rd = new Radio();
        rd.setCurrentStation(9);

        rd.prevStation();

        int expected = 8;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }
}