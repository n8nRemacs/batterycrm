package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class PolygonManeuverStyle implements Serializable {
    private boolean enabled;
    private float fadeAlpha;
    private float fadeDistance;
    private float polygonAlpha;
    private int polygonColor;
    private PolygonManeuverRenderMode renderMode;
    private int trajectoryColor;
    private float trajectoryWidth;

    public PolygonManeuverStyle(float f12, int i12, float f13, int i13, @N PolygonManeuverRenderMode polygonManeuverRenderMode, float f14, float f15, boolean z12) {
        if (polygonManeuverRenderMode == null) {
            throw new IllegalArgumentException("Required field \"renderMode\" cannot be null");
        }
        this.trajectoryWidth = f12;
        this.trajectoryColor = i12;
        this.polygonAlpha = f13;
        this.polygonColor = i13;
        this.renderMode = polygonManeuverRenderMode;
        this.fadeDistance = f14;
        this.fadeAlpha = f15;
        this.enabled = z12;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public float getFadeAlpha() {
        return this.fadeAlpha;
    }

    public float getFadeDistance() {
        return this.fadeDistance;
    }

    public float getPolygonAlpha() {
        return this.polygonAlpha;
    }

    public int getPolygonColor() {
        return this.polygonColor;
    }

    @N
    public PolygonManeuverRenderMode getRenderMode() {
        return this.renderMode;
    }

    public int getTrajectoryColor() {
        return this.trajectoryColor;
    }

    public float getTrajectoryWidth() {
        return this.trajectoryWidth;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.trajectoryWidth = archive.add(this.trajectoryWidth);
        this.trajectoryColor = archive.add(this.trajectoryColor);
        this.polygonAlpha = archive.add(this.polygonAlpha);
        this.polygonColor = archive.add(this.polygonColor);
        this.renderMode = (PolygonManeuverRenderMode) archive.add((Archive) this.renderMode, false, (Class<Archive>) PolygonManeuverRenderMode.class);
        this.fadeDistance = archive.add(this.fadeDistance);
        this.fadeAlpha = archive.add(this.fadeAlpha);
        this.enabled = archive.add(this.enabled);
    }

    public PolygonManeuverStyle() {
    }
}
