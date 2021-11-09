package ru.netology.domain;

public class Radio {
    public int currentStation;
    public int currentVolume;

    public void setCurrentStation(int CurrentStation) {
        if (CurrentStation < 0) {
            return;
        }
        if (CurrentStation > 9) {
            return;
        }
        this.currentStation = CurrentStation;
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation == 9) {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation == 0) {
            currentStation = 9;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 10) {
            System.out.println(currentVolume);
        }
    }
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            System.out.println(currentVolume);
        }
    }
    public int getCurrentStation() {
        return currentStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
}
