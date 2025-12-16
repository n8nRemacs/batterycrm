package com.yandex.mapkit.road_events_layer;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes7.dex */
public class HighlightCircleStyle implements Serializable {
    private long animationDuration;
    private int fillColor;
    private float maximumRadius;
    private int strokeColor;
    private float strokeWidth;

    public HighlightCircleStyle(int i12, float f12, int i13, float f13, long j12) {
        this.strokeColor = i12;
        this.strokeWidth = f12;
        this.fillColor = i13;
        this.maximumRadius = f13;
        this.animationDuration = j12;
    }

    public long getAnimationDuration() {
        return this.animationDuration;
    }

    public int getFillColor() {
        return this.fillColor;
    }

    public float getMaximumRadius() {
        return this.maximumRadius;
    }

    public int getStrokeColor() {
        return this.strokeColor;
    }

    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.strokeColor = archive.add(this.strokeColor);
        this.strokeWidth = archive.add(this.strokeWidth);
        this.fillColor = archive.add(this.fillColor);
        this.maximumRadius = archive.add(this.maximumRadius);
        this.animationDuration = archive.add(this.animationDuration);
    }

    public HighlightCircleStyle() {
    }
}
