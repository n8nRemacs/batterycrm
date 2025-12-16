package com.yandex.mapkit.geometry;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class BoundingBox implements Serializable {
    private Point northEast;
    private Point southWest;

    public BoundingBox(@N Point point, @N Point point2) {
        if (point == null) {
            throw new IllegalArgumentException("Required field \"southWest\" cannot be null");
        }
        if (point2 == null) {
            throw new IllegalArgumentException("Required field \"northEast\" cannot be null");
        }
        this.southWest = point;
        this.northEast = point2;
    }

    @N
    public Point getNorthEast() {
        return this.northEast;
    }

    @N
    public Point getSouthWest() {
        return this.southWest;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.southWest = (Point) archive.add((Archive) this.southWest, false, (Class<Archive>) Point.class);
        this.northEast = (Point) archive.add((Archive) this.northEast, false, (Class<Archive>) Point.class);
    }

    public BoundingBox() {
    }
}
