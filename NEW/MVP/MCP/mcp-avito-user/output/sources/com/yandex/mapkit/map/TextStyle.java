package com.yandex.mapkit.map;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public final class TextStyle implements Serializable {
    private Integer color;
    private float offset;
    private boolean offsetFromIcon;
    private Integer outlineColor;
    private float outlineWidth;
    private Placement placement;
    private float size;
    private boolean textOptional;

    public enum Placement {
        CENTER,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT
    }

    public TextStyle(float f12, @P Integer num, float f13, @P Integer num2, @N Placement placement, float f14, boolean z12, boolean z13) {
        this.size = 8.0f;
        this.outlineWidth = 1.0f;
        this.placement = Placement.CENTER;
        this.offset = 0.0f;
        this.offsetFromIcon = true;
        this.textOptional = false;
        if (placement == null) {
            throw new IllegalArgumentException("Required field \"placement\" cannot be null");
        }
        this.size = f12;
        this.color = num;
        this.outlineWidth = f13;
        this.outlineColor = num2;
        this.placement = placement;
        this.offset = f14;
        this.offsetFromIcon = z12;
        this.textOptional = z13;
    }

    @P
    public Integer getColor() {
        return this.color;
    }

    public float getOffset() {
        return this.offset;
    }

    public boolean getOffsetFromIcon() {
        return this.offsetFromIcon;
    }

    @P
    public Integer getOutlineColor() {
        return this.outlineColor;
    }

    public float getOutlineWidth() {
        return this.outlineWidth;
    }

    @N
    public Placement getPlacement() {
        return this.placement;
    }

    public float getSize() {
        return this.size;
    }

    public boolean getTextOptional() {
        return this.textOptional;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.size = archive.add(this.size);
        this.color = archive.add(this.color, true);
        this.outlineWidth = archive.add(this.outlineWidth);
        this.outlineColor = archive.add(this.outlineColor, true);
        this.placement = (Placement) archive.add((Archive) this.placement, false, (Class<Archive>) Placement.class);
        this.offset = archive.add(this.offset);
        this.offsetFromIcon = archive.add(this.offsetFromIcon);
        this.textOptional = archive.add(this.textOptional);
    }

    public TextStyle setColor(@P Integer num) {
        this.color = num;
        return this;
    }

    public TextStyle setOffset(float f12) {
        this.offset = f12;
        return this;
    }

    public TextStyle setOffsetFromIcon(boolean z12) {
        this.offsetFromIcon = z12;
        return this;
    }

    public TextStyle setOutlineColor(@P Integer num) {
        this.outlineColor = num;
        return this;
    }

    public TextStyle setOutlineWidth(float f12) {
        this.outlineWidth = f12;
        return this;
    }

    public TextStyle setPlacement(@N Placement placement) {
        if (placement == null) {
            throw new IllegalArgumentException("Required field \"placement\" cannot be null");
        }
        this.placement = placement;
        return this;
    }

    public TextStyle setSize(float f12) {
        this.size = f12;
        return this;
    }

    public TextStyle setTextOptional(boolean z12) {
        this.textOptional = z12;
        return this;
    }

    public TextStyle() {
        this.size = 8.0f;
        this.outlineWidth = 1.0f;
        this.placement = Placement.CENTER;
        this.offset = 0.0f;
        this.offsetFromIcon = true;
        this.textOptional = false;
    }
}
