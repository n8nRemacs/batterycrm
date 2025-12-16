package com.yandex.mapkit.geometry;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class Geometry implements Serializable {
    private BoundingBox boundingBox;
    private Circle circle;
    private MultiPolygon multiPolygon;
    private Point point;
    private Polygon polygon;
    private Polyline polyline;

    @N
    public static Geometry fromBoundingBox(@N BoundingBox boundingBox) {
        if (boundingBox == null) {
            throw new IllegalArgumentException("Variant value \"boundingBox\" cannot be null");
        }
        Geometry geometry = new Geometry();
        geometry.boundingBox = boundingBox;
        return geometry;
    }

    @N
    public static Geometry fromCircle(@N Circle circle) {
        if (circle == null) {
            throw new IllegalArgumentException("Variant value \"circle\" cannot be null");
        }
        Geometry geometry = new Geometry();
        geometry.circle = circle;
        return geometry;
    }

    @N
    public static Geometry fromMultiPolygon(@N MultiPolygon multiPolygon) {
        if (multiPolygon == null) {
            throw new IllegalArgumentException("Variant value \"multiPolygon\" cannot be null");
        }
        Geometry geometry = new Geometry();
        geometry.multiPolygon = multiPolygon;
        return geometry;
    }

    @N
    public static Geometry fromPoint(@N Point point) {
        if (point == null) {
            throw new IllegalArgumentException("Variant value \"point\" cannot be null");
        }
        Geometry geometry = new Geometry();
        geometry.point = point;
        return geometry;
    }

    @N
    public static Geometry fromPolygon(@N Polygon polygon) {
        if (polygon == null) {
            throw new IllegalArgumentException("Variant value \"polygon\" cannot be null");
        }
        Geometry geometry = new Geometry();
        geometry.polygon = polygon;
        return geometry;
    }

    @N
    public static Geometry fromPolyline(@N Polyline polyline) {
        if (polyline == null) {
            throw new IllegalArgumentException("Variant value \"polyline\" cannot be null");
        }
        Geometry geometry = new Geometry();
        geometry.polyline = polyline;
        return geometry;
    }

    @P
    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    @P
    public Circle getCircle() {
        return this.circle;
    }

    @P
    public MultiPolygon getMultiPolygon() {
        return this.multiPolygon;
    }

    @P
    public Point getPoint() {
        return this.point;
    }

    @P
    public Polygon getPolygon() {
        return this.polygon;
    }

    @P
    public Polyline getPolyline() {
        return this.polyline;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.point = (Point) archive.add((Archive) this.point, true, (Class<Archive>) Point.class);
        this.polyline = (Polyline) archive.add((Archive) this.polyline, true, (Class<Archive>) Polyline.class);
        this.polygon = (Polygon) archive.add((Archive) this.polygon, true, (Class<Archive>) Polygon.class);
        this.multiPolygon = (MultiPolygon) archive.add((Archive) this.multiPolygon, true, (Class<Archive>) MultiPolygon.class);
        this.boundingBox = (BoundingBox) archive.add((Archive) this.boundingBox, true, (Class<Archive>) BoundingBox.class);
        this.circle = (Circle) archive.add((Archive) this.circle, true, (Class<Archive>) Circle.class);
    }
}
