package com.yandex.mapkit.geometry;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes7.dex */
public class Point implements Serializable {
    private double latitude;
    private double longitude;

    public Point(double d12, double d13) {
        this.latitude = d12;
        this.longitude = d13;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.latitude = archive.add(this.latitude);
        this.longitude = archive.add(this.longitude);
    }

    public Point() {
    }
}
