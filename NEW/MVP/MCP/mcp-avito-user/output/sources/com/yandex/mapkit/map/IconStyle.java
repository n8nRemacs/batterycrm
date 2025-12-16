package com.yandex.mapkit.map;

import android.graphics.PointF;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.P;

/* loaded from: classes7.dex */
public final class IconStyle implements Serializable {
    private PointF anchor;
    private Boolean flat;
    private RotationType rotationType;
    private Float scale;
    private Rect tappableArea;
    private Boolean visible;
    private Float zIndex;

    public IconStyle(@P PointF pointF, @P RotationType rotationType, @P Float f12, @P Boolean bool, @P Boolean bool2, @P Float f13, @P Rect rect) {
        this.anchor = pointF;
        this.rotationType = rotationType;
        this.zIndex = f12;
        this.flat = bool;
        this.visible = bool2;
        this.scale = f13;
        this.tappableArea = rect;
    }

    @P
    public PointF getAnchor() {
        return this.anchor;
    }

    @P
    public Boolean getFlat() {
        return this.flat;
    }

    @P
    public RotationType getRotationType() {
        return this.rotationType;
    }

    @P
    public Float getScale() {
        return this.scale;
    }

    @P
    public Rect getTappableArea() {
        return this.tappableArea;
    }

    @P
    public Boolean getVisible() {
        return this.visible;
    }

    @P
    public Float getZIndex() {
        return this.zIndex;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.anchor = archive.add(this.anchor, true);
        this.rotationType = (RotationType) archive.add((Archive) this.rotationType, true, (Class<Archive>) RotationType.class);
        this.zIndex = archive.add(this.zIndex, true);
        this.flat = archive.add(this.flat, true);
        this.visible = archive.add(this.visible, true);
        this.scale = archive.add(this.scale, true);
        this.tappableArea = (Rect) archive.add((Archive) this.tappableArea, true, (Class<Archive>) Rect.class);
    }

    public IconStyle setAnchor(@P PointF pointF) {
        this.anchor = pointF;
        return this;
    }

    public IconStyle setFlat(@P Boolean bool) {
        this.flat = bool;
        return this;
    }

    public IconStyle setRotationType(@P RotationType rotationType) {
        this.rotationType = rotationType;
        return this;
    }

    public IconStyle setScale(@P Float f12) {
        this.scale = f12;
        return this;
    }

    public IconStyle setTappableArea(@P Rect rect) {
        this.tappableArea = rect;
        return this;
    }

    public IconStyle setVisible(@P Boolean bool) {
        this.visible = bool;
        return this;
    }

    public IconStyle setZIndex(@P Float f12) {
        this.zIndex = f12;
        return this;
    }

    public IconStyle() {
    }
}
