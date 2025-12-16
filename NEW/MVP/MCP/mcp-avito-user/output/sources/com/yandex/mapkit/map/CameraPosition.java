package com.yandex.mapkit.map;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class CameraPosition implements Serializable {
    private float azimuth;
    private Point target;
    private float tilt;
    private float zoom;

    public CameraPosition(@N Point point, float f12, float f13, float f14) {
        if (point == null) {
            throw new IllegalArgumentException("Required field \"target\" cannot be null");
        }
        this.target = point;
        this.zoom = f12;
        this.azimuth = f13;
        this.tilt = f14;
    }

    public float getAzimuth() {
        return this.azimuth;
    }

    @N
    public Point getTarget() {
        return this.target;
    }

    public float getTilt() {
        return this.tilt;
    }

    public float getZoom() {
        return this.zoom;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.target = (Point) archive.add((Archive) this.target, false, (Class<Archive>) Point.class);
        this.zoom = archive.add(this.zoom);
        this.azimuth = archive.add(this.azimuth);
        this.tilt = archive.add(this.tilt);
    }

    public CameraPosition() {
    }
}
