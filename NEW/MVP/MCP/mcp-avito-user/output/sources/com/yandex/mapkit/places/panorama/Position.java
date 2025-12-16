package com.yandex.mapkit.places.panorama;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class Position implements Serializable {
    private double altitude;
    private Point point;

    public Position(@N Point point, double d12) {
        if (point == null) {
            throw new IllegalArgumentException("Required field \"point\" cannot be null");
        }
        this.point = point;
        this.altitude = d12;
    }

    public double getAltitude() {
        return this.altitude;
    }

    @N
    public Point getPoint() {
        return this.point;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.point = (Point) archive.add((Archive) this.point, false, (Class<Archive>) Point.class);
        this.altitude = archive.add(this.altitude);
    }

    public Position() {
    }
}
