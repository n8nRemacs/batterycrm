package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class ManeuverStyle implements Serializable {

    /* renamed from: arrow, reason: collision with root package name */
    private ArrowManeuverStyle f377446arrow;
    private PolygonManeuverStyle polygon;

    public ManeuverStyle(@N ArrowManeuverStyle arrowManeuverStyle, @N PolygonManeuverStyle polygonManeuverStyle) {
        if (arrowManeuverStyle == null) {
            throw new IllegalArgumentException("Required field \"arrow\" cannot be null");
        }
        if (polygonManeuverStyle == null) {
            throw new IllegalArgumentException("Required field \"polygon\" cannot be null");
        }
        this.f377446arrow = arrowManeuverStyle;
        this.polygon = polygonManeuverStyle;
    }

    @N
    public ArrowManeuverStyle getArrow() {
        return this.f377446arrow;
    }

    @N
    public PolygonManeuverStyle getPolygon() {
        return this.polygon;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.f377446arrow = (ArrowManeuverStyle) archive.add((Archive) this.f377446arrow, false, (Class<Archive>) ArrowManeuverStyle.class);
        this.polygon = (PolygonManeuverStyle) archive.add((Archive) this.polygon, false, (Class<Archive>) PolygonManeuverStyle.class);
    }

    public ManeuverStyle() {
    }
}
