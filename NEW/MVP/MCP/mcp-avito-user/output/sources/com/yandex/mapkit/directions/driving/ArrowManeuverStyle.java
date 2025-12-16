package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes7.dex */
public class ArrowManeuverStyle implements Serializable {
    private boolean enabled;
    private int fillColor;
    private float length;
    private int outlineColor;
    private float outlineWidth;
    private float triangleHeight;

    public ArrowManeuverStyle(int i12, int i13, float f12, float f13, float f14, boolean z12) {
        this.fillColor = i12;
        this.outlineColor = i13;
        this.outlineWidth = f12;
        this.length = f13;
        this.triangleHeight = f14;
        this.enabled = z12;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public int getFillColor() {
        return this.fillColor;
    }

    public float getLength() {
        return this.length;
    }

    public int getOutlineColor() {
        return this.outlineColor;
    }

    public float getOutlineWidth() {
        return this.outlineWidth;
    }

    public float getTriangleHeight() {
        return this.triangleHeight;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.fillColor = archive.add(this.fillColor);
        this.outlineColor = archive.add(this.outlineColor);
        this.outlineWidth = archive.add(this.outlineWidth);
        this.length = archive.add(this.length);
        this.triangleHeight = archive.add(this.triangleHeight);
        this.enabled = archive.add(this.enabled);
    }

    public ArrowManeuverStyle() {
    }
}
