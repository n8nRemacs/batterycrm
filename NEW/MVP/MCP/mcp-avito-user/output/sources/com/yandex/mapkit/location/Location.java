package com.yandex.mapkit.location;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class Location implements Serializable {
    private long absoluteTimestamp;
    private Double accuracy;
    private Double altitude;
    private Double altitudeAccuracy;
    private Double heading;
    private Point position;
    private long relativeTimestamp;
    private Double speed;

    public Location(@N Point point, @P Double d12, @P Double d13, @P Double d14, @P Double d15, @P Double d16, long j12, long j13) {
        if (point == null) {
            throw new IllegalArgumentException("Required field \"position\" cannot be null");
        }
        this.position = point;
        this.accuracy = d12;
        this.altitude = d13;
        this.altitudeAccuracy = d14;
        this.heading = d15;
        this.speed = d16;
        this.absoluteTimestamp = j12;
        this.relativeTimestamp = j13;
    }

    public long getAbsoluteTimestamp() {
        return this.absoluteTimestamp;
    }

    @P
    public Double getAccuracy() {
        return this.accuracy;
    }

    @P
    public Double getAltitude() {
        return this.altitude;
    }

    @P
    public Double getAltitudeAccuracy() {
        return this.altitudeAccuracy;
    }

    @P
    public Double getHeading() {
        return this.heading;
    }

    @N
    public Point getPosition() {
        return this.position;
    }

    public long getRelativeTimestamp() {
        return this.relativeTimestamp;
    }

    @P
    public Double getSpeed() {
        return this.speed;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.position = (Point) archive.add((Archive) this.position, false, (Class<Archive>) Point.class);
        this.accuracy = archive.add(this.accuracy, true);
        this.altitude = archive.add(this.altitude, true);
        this.altitudeAccuracy = archive.add(this.altitudeAccuracy, true);
        this.heading = archive.add(this.heading, true);
        this.speed = archive.add(this.speed, true);
        this.absoluteTimestamp = archive.add(this.absoluteTimestamp);
        this.relativeTimestamp = archive.add(this.relativeTimestamp);
    }

    public Location() {
    }
}
