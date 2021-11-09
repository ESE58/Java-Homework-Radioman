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
        this.currentVolume = currentVolume;
    }

    int volumeMin = 0;
    int volumeMax = 10;

    public void increaseVolume() {
        if (currentVolume < volumeMax) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == volumeMax) {
            System.out.println(currentVolume);
        }
    }
    public void decreaseVolume() {
        if (currentVolume > volumeMin) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == volumeMin) {
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
