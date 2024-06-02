package lab4.prob3;

import java.time.LocalDateTime;

public class LightSensor implements Sensor {
    private HomeLocation location;
    private LocalDateTime lastUpdated;
    private double lightLevel;

    public LightSensor(HomeLocation location, double lightLevel) {
        this.location = location;
        this.lightLevel = lightLevel;
    }

    @Override
    public String getSensorType() {
        return getClass().getName();
    }

    @Override
    public double getReading() {
        return lightLevel;
    }

    @Override
    public HomeLocation getLocation() {
        return location;
    }

    @Override
    public LocalDateTime getLastUpdated() {
        lastUpdated = LocalDateTime.now();
        return lastUpdated;
    }

    @Override
    public String performAction() {
        return lightLevel < 100 ? "an alert to turn on the light" : " Light is sufficient";
    }
}
