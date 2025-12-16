package com.yandex.mapkit.search;

import com.yandex.mapkit.geometry.Direction;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Span;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class Panorama implements Serializable {
    private Direction direction;

    /* renamed from: id, reason: collision with root package name */
    private String f377468id;
    private Point point;
    private Span span;

    public Panorama(@N String str, @N Direction direction, @N Span span, @N Point point) {
        if (str == null) {
            throw new IllegalArgumentException("Required field \"id\" cannot be null");
        }
        if (direction == null) {
            throw new IllegalArgumentException("Required field \"direction\" cannot be null");
        }
        if (span == null) {
            throw new IllegalArgumentException("Required field \"span\" cannot be null");
        }
        if (point == null) {
            throw new IllegalArgumentException("Required field \"point\" cannot be null");
        }
        this.f377468id = str;
        this.direction = direction;
        this.span = span;
        this.point = point;
    }

    @N
    public Direction getDirection() {
        return this.direction;
    }

    @N
    public String getId() {
        return this.f377468id;
    }

    @N
    public Point getPoint() {
        return this.point;
    }

    @N
    public Span getSpan() {
        return this.span;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.f377468id = archive.add(this.f377468id, false);
        this.direction = (Direction) archive.add((Archive) this.direction, false, (Class<Archive>) Direction.class);
        this.span = (Span) archive.add((Archive) this.span, false, (Class<Archive>) Span.class);
        this.point = (Point) archive.add((Archive) this.point, false, (Class<Archive>) Point.class);
    }

    public Panorama() {
    }
}
