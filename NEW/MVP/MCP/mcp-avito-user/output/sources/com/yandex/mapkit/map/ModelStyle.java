package com.yandex.mapkit.map;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public final class ModelStyle implements Serializable {
    private RenderMode renderMode;
    private float scale;
    private UnitType unitType;
    private String variantName;

    public enum RenderMode {
        BUILDING,
        USER_MODEL
    }

    public enum UnitType {
        UNIT,
        NORMALIZED,
        METER
    }

    public ModelStyle(float f12, @N UnitType unitType, @N RenderMode renderMode, @P String str) {
        this.scale = 1.0f;
        this.unitType = UnitType.UNIT;
        this.renderMode = RenderMode.USER_MODEL;
        if (unitType == null) {
            throw new IllegalArgumentException("Required field \"unitType\" cannot be null");
        }
        if (renderMode == null) {
            throw new IllegalArgumentException("Required field \"renderMode\" cannot be null");
        }
        this.scale = f12;
        this.unitType = unitType;
        this.renderMode = renderMode;
        this.variantName = str;
    }

    @N
    public RenderMode getRenderMode() {
        return this.renderMode;
    }

    public float getScale() {
        return this.scale;
    }

    @N
    public UnitType getUnitType() {
        return this.unitType;
    }

    @P
    public String getVariantName() {
        return this.variantName;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.scale = archive.add(this.scale);
        this.unitType = (UnitType) archive.add((Archive) this.unitType, false, (Class<Archive>) UnitType.class);
        this.renderMode = (RenderMode) archive.add((Archive) this.renderMode, false, (Class<Archive>) RenderMode.class);
        this.variantName = archive.add(this.variantName, true);
    }

    public ModelStyle setRenderMode(@N RenderMode renderMode) {
        if (renderMode == null) {
            throw new IllegalArgumentException("Required field \"renderMode\" cannot be null");
        }
        this.renderMode = renderMode;
        return this;
    }

    public ModelStyle setScale(float f12) {
        this.scale = f12;
        return this;
    }

    public ModelStyle setUnitType(@N UnitType unitType) {
        if (unitType == null) {
            throw new IllegalArgumentException("Required field \"unitType\" cannot be null");
        }
        this.unitType = unitType;
        return this;
    }

    public ModelStyle setVariantName(@P String str) {
        this.variantName = str;
        return this;
    }

    public ModelStyle() {
        this.scale = 1.0f;
        this.unitType = UnitType.UNIT;
        this.renderMode = RenderMode.USER_MODEL;
    }
}
